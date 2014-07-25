apply plugin: 'java'

sourceCompatibility = 1.6 // or '1.6', '6', 6, JavaVersion.VERSION_1_6, new Compatibility('Java 6')

class Compatibility {
    String version

    Compatibility(String versionValue) {
        def matcher = (versionValue =~ /Java (\d)/)
        version = matcher[0][1]
    }

    String toString() { version }
}
