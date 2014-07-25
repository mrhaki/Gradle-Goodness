...
configurations {
    all*.exclude group: 'xml-apis', module: 'xmlParserAPIs'
}

// Equivalent to:
configurations {
    all.collect { configuration ->
        configuration.exclude group: 'xml-apis', module: 'xmlParserAPIs'
    }
}
...
