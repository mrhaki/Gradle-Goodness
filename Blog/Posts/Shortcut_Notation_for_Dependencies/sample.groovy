dependencies {
    compile group: 'commons-lang', name: 'commons-lang', version: '2.4'  // Map notation.
    compile(
        [group: 'commons-lang', name: 'commons-lang', version: '2.4'],
        [group: 'commons-io', name: 'commons-io', version: '1.4']
    )  // Multiple map notation.
    compile 'commons-lang:commons-lang:2.4', 'commons-io:commons-io:1.4'  // String notation.
}
