// File: app/web/src/main/webapp/language.groovy
import com.mrhaki.blog.web.LanguageHelper

def helper = new LanguageHelper()

html.html {
    head {
        title "Simple page"
    }
    body {
        h1 "Simple page"
        p "My favorite language is '$helper.groovyValue'."
    }
}
