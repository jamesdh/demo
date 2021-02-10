package com.example


import io.micronaut.context.ApplicationContext
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject
import javax.sql.DataSource

@MicronautTest
class UserServiceSpec extends Specification {

    @Inject UserService userService
    @Inject ApplicationContext applicationContext

    // Everything passes so long as we don't actually try to get the DataSource bean from the ApplicationContext

    void "test bean exists"() {
        expect:
        applicationContext.containsBean(DataSource)
    }

    void "test sql"() {
        expect:
        userService.testSql()
    }

}
