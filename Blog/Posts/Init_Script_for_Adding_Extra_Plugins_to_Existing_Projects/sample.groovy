// File: quality.gradle
allprojects {
    afterEvaluate { project -&gt;
        def groovyProject = project.plugins.hasPlugin('groovy')
        def javaProject = project.plugins.hasPlugin('java')

        if (javaProject) {
            // Add Checkstyle plugin.
            project.apply plugin: 'checkstyle'

            // Task to download common Checkstyle configuration
            // from company intranet.
            task downloadCheckstyleConfig(type: DownloadFileTask) {
                description = 'Download company Checkstyle configuration'
                
                url = 'http://intranet/source/company-style.xml'
                destinationFile = checkstyle.configFile
            }

            // For each Checkstyle task we make sure
            // the company Checkstyle configuration is 
            // first downloaded.
            tasks.withType(Checkstyle) { 
                it.dependsOn 'downloadCheckstyleConfig'
            }
        }

        if (groovyProject) {
            // Add Codenarc plugin.
            project.apply plugin: 'codenarc'
        }
    }
}

class DownloadFileTask extends DefaultTask {
    @Input
    String url

    @OutputFile
    File destinationFile

    @TaskAction
    def downloadFile() {
        destinationFile.bytes = new URL(url).bytes
    }
}
