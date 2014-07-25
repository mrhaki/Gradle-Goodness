// File: ~/.gradle/init.gradle
class SnarlNotifyListener extends BuildAdapter {
    void buildFinished(BuildResult result) {
        if (result.failure) {
            snarlNotify 'Gradle build failure', result.failure.message, true
        } else {
            snarlNotify 'Gradle build finished', 'Build successful'
        }
    }

    void snarlNotify(title, message = 'No message', sticky = false) {
        def cmd = [
            '&lt;Path to Snarl_CMD.exe&gt;',  // Replace with your local path.
            'snShowMessage',
            sticky ? '0' : '10',  // If non-sticky display for 10 seconds.
            title,
            message,
            '&lt;gradle_home&gt;/docs/groovydoc/groovy.ico'  // Nice little icon, use local path.
        ]
        cmd.execute()
    }    
}

def listener = new SnarlNotifyListener()
gradle.addBuildListener listener
