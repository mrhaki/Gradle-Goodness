// File: book/build.gradle
apply plugin: 'book'

book {
    title 'Groovy Goodness Notebook'
    chapter project(':chapter1')
    chapter project(':chapter2')
}
