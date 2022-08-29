package com.fastcampus.springrunner.divelog

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(args = ["--app.name=dive-log-test"])
class ApplicationArgumentsTest {

    @Test
    fun testApplicationArguments(@Autowired appArgs: ApplicationArguments) {
        assertThat(appArgs.optionNames).contains("app.name")
        assertThat(appArgs.getOptionValues("app.name")).containsOnly("dive-log-test")
    }
}