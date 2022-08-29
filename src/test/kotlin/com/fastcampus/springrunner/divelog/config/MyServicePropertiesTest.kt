package com.fastcampus.springrunner.divelog.config

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MyServicePropertiesTest {

    @Test
    fun test(@Autowired myServiceProperties: MyServiceProperties) {
        Assertions.assertThat(myServiceProperties.enabled).isFalse()
    }
}