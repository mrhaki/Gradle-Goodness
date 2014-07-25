apply plugin: 'java'
apply plugin: 'idea'

idea {
    project {
        // Here we customize the .ipr file generation.
        ipr {
            // XML hook to customize the XML before
            // it is written to disk
            withXml { xmlProvider ->
                // Get root node.
                def project = xmlProvider.asNode()
                customizeSpellingInspection(project)
            }
        }
    }
}

/* Change or add spelling inspection */
def customizeSpellingInspection(project) {
    def inspections = findComponent(project, 'InspectionProjectProfileManager')
    
    if (inspections) {
        // Update existing profiles to disable spell checking
        // for processCode and processLiterals.
        def spellChecking = inspections.profiles.profile.option.inspection_tool.find { it.@class == 'SpellCheckingInspection'}
        if (spellChecking) {
            ['processCode', 'processLiterals'].each { optionName ->
                spellChecking.option.find { it.@name == optionName }.@value = 'false'
            }
        }
    } else {
        // Create new InspectionProjectProfileManager component. 
        inspections = project.appendNode('component', [name: 'InspectionProjectProfileManager'])

        // Use NodeBuilder to build profiles XML structure.
        def builder = new NodeBuilder()
        def profiles = builder.profiles {
            profile(version: '1.0', is_locked: false) {
                option(name: 'myName', value: 'Default Inspections')
                option(name: 'myLocal', value: false)
                inspection_tool(class: 'SpellCheckingInspection', enabled: true, level: 'TYPO', enabled_by_default: true) {
                    option(name: 'processCode', value: false)
                    option(name: 'processLiterals', value: false)
                    option(name: 'processComments', value: true)
                }
            }
        }
        // Add result from NodeBuilder
        inspections.append profiles

        // Extra nodes added with appendNode() method.
        inspections.appendNode 'option', [name: 'PROJECT_PROFILE', value: 'Default Inspections']
        inspections.appendNode 'option', [name: 'USE_PROJECT_PROFILE', value: true]
        inspections.appendNode 'version', [value: "1.0"]
    }
}

/* Search component with given name */
def findComponent(project, name) {
    project.component.find { it.@name == name }
}
