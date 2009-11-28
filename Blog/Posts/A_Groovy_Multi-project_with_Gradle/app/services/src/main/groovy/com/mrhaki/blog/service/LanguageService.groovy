// File: app/services/src/main/groovy/com/mrhaki/blog/service/LanguageService.groovy
package com.mrhaki.blog.service

import com.mrhaki.blog.domain.Language
import com.mrhaki.blog.data.LanguageDao

class LanguageService {
    def dao = new LanguageDao()
    
    Language findGroovy() {
       dao.findAll().find { it.name == 'Groovy' }
    }
}