// File: build.gradle
['groovy', 'code-quality'].each { 
    apply plugin: it 
}

repositories {
    mavenCentral()
}

dependencies {
    groovy group: 'org.codehaus.groovy', name: 'groovy', version: '1.7.6'
}

codeNarcConfigFileName = 'config/codenarc/rules.groovy'
