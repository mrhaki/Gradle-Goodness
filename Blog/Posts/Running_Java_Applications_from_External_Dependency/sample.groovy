// File: build.gradle

// Base plugin for task rule clean&lt;task&gt;
apply plugin: 'base'

repositories.mavenCentral()

// New configuration for CXF dependencies.
configurations { cxf }

ext {
    // CXF version.
    cxfVersion = '2.6.2'

    // Artifacts for CXF dependency.
    cxfArtifacts = [
        'cxf-tools-wsdlto-frontend-jaxws', 
        'cxf-tools-wsdlto-databinding-jaxb', 
        'cxf-tools-common', 
        'cxf-tools-wsdlto-core'
    ]
}

dependencies {
    // Assign CXF dependencies to configuration.
    cxfArtifacts.each { artifact -&gt;
        cxf "org.apache.cxf:$artifact:$cxfVersion"
    }
}

// Custom task to generate Java classes
// from WSDL.
task wsdl2java(type: JavaExec) {
    ext {
        wsdlFile = 'src/wsdl/service-contract.wsdl'
        outputDir = file("$buildDir/generated/cxf")
    }

    inputs.file file(wsdlFile)
    outputs.dir outputDir

    // Main Java class to invoke.
    main = 'org.apache.cxf.tools.wsdlto.WSDLToJava'

    // Set classpath to dependencies assigned
    // to the cxf configuration.
    classpath = configurations.cxf

    // Arguments to be passed to WSDLToJava.
    args '-d', outputDir
    args '-client'
    args '-verbose'
    args '-validate'
    args wsdlFile
}
