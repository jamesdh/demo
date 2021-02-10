package com.example

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

import static grails.gorm.hibernate.mapping.MappingBuilder.orm

@Entity
class User implements GormEntity<User> {

    String login

    static constraints = {
        login nullable: false, blank: false
    }

    static final mapping = orm {
        table('`User`')
    }

}
