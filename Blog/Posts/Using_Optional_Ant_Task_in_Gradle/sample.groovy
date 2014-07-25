// File: build.gradle

// We define a new configuration with the name 'sshAntTask'.
// This configuration is used to define our dependencies.
configurations {
    sshAntTask
}

// Define the Maven central repository to look for the dependencies.
repositories {
    mavenCentral()
}

// Assign dependencies to the sshAntTask configuration.
dependencies {
    sshAntTask 'org.apache.ant:ant-jsch:1.7.1', 'jsch:jsch:0.1.29'
}

// Sample task which uses the scp Ant optional task.
task update {
    description = 'Update files on remote server.'

    // Get passphrase from user input.
    def console = System.console()
    def passphrase = console.readPassword('%s: ', 'Please enter the passphrase for the keyfile')
        
    // Redefine scp Ant task, with the classpath property set to our newly defined
    // sshAntTask configuration classpath.
    ant.taskdef(name: 'scp', classname: 'org.apache.tools.ant.taskdefs.optional.ssh.Scp',
            classpath: configurations.sshAntTask.asPath)
            
    // Invoke the scp Ant task. (Use gradle -i update to see the output of the Ant task.)
    ant.scp(todir: 'mrhaki@servername:/home/mrhaki',
            keyfile: '${user.home}/.ssh/id_rsa', 
            passphrase: passphrase as String, // Use phassphrase entered by the user.
            verbose: 'true') {
        fileset(dir: 'work') {
            include(name: '**/**')
        }
    }            
}
