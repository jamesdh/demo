package com.example

import grails.gorm.services.Service
import groovy.sql.Sql

import javax.inject.Inject
import javax.inject.Singleton

interface UserService {
    boolean testSql()
}

@Service(User)
@Singleton
abstract class UserDataService implements UserService {

    // Commenting this out will cause tests to pass.
    @Inject Sql sql

    @Override
    boolean testSql() {
        return true
    }
}