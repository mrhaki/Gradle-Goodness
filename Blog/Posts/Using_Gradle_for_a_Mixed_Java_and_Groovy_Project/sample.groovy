usePlugin 'groovy'

version = &quot;1.0-${new Date().format('yyyyMMdd')}&quot; // The script is all Groovy, so we make use of all methods and features.
archivesBaseName = 'greeting'

repositories {
    mavenCentral()  // Define Maven central repository to look for dependencies.
}

dependencies {
    groovy 'org.codehaus.groovy:groovy:1.6.5'  // group:name:version is a nice shortcut notation for dependencies. 
    testCompile 'junit:junit:4.7'
}

task initProject(description: 'Initialize project directory structure.') &lt;&lt; {
    // Default package to be created in each src dir.
    def defaultPackage = 'com/mrhaki/blog'
    
    ['java', 'groovy', 'resources'].each {
        // convention.sourceSets contains the directory structure
        // for our Groovy project. So we use this struture
        // and make a directory for each node.
        convention.sourceSets.all.&quot;${it}&quot;.srcDirs.each { dirs -&gt;
            dirs.each { dir -&gt;
                def newDir = new File(dir, defaultPackage)
                logger.info &quot;Creating directory $newDir&quot;  // gradle -i shows this message.
                newDir.mkdirs()  // Create dir.
            }
        }
    }
}
