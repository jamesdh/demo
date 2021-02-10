package com.example

import groovy.sql.Sql
import io.micronaut.context.ApplicationContext
import io.micronaut.context.annotation.Factory

import javax.inject.Inject
import javax.inject.Singleton
import javax.sql.DataSource

@Factory
class GroovySql {

    @Inject ApplicationContext applicationContext

    // Injecting it is the same issue, except even trickier to debug because it freezes before the factory method is called.
//    @Singleton
//    Sql sql(DataSource dataSource) {
//        new Sql(dataSource)
//    }

    @Singleton
    Sql sql() {
        new Sql(applicationContext.getBean(DataSource))
    }
}
