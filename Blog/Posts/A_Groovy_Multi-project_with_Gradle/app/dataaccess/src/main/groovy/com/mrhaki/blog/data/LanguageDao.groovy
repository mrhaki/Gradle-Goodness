// File: app/dataaccess/src/main/groovy/com/mrhaki/blog/data/LanguageDao.groovy
package com.mrhaki.blog.data

import com.mrhaki.blog.domain.Language

class LanguageDao {
    List findAll() {
        [new Language(name: 'Java'), new Language(name: 'Groovy'), new Language(name: 'Scala')]
    }
}