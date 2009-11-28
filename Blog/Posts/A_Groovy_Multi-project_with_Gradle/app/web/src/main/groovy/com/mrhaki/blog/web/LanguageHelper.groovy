// File: app/web/src/main/groovy/com/mrhaki/blog/web/LanguageHelper.groovy
package com.mrhaki.blog.web

import com.mrhaki.blog.service.LanguageService

class LanguageHelper {
    def service = new LanguageService()
    
    String getGroovyValue() {
        service.findGroovy()?.name ?: 'Groovy language not found'
    }
}