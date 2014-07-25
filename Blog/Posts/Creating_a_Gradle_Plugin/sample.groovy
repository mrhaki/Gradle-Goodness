// File: build.gradle
usePlugin(com.mrhaki.gradle.MakeDirsPlugin)
usePlugin('war')  // Extra plugin so the task mkdirs from the plugin can do something.

basePackageDir = 'com/mrhaki'  // Property from plugin convention object.
makeDirs 'src/main/config' // Method from plugin convention object.
