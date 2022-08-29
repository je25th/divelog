package com.fastcampus.springrunner.divelog.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.net.InetAddress

@ConstructorBinding
@ConfigurationProperties("my.service")
data class MyServiceProperties(

    val enabled: Boolean,
    val remoteAddress: InetAddress,
    val security: Security

) {
    data class Security(
        val username: String,
        val password: String,
        val roles: List<String>,
        val attrs: Map<String, Boolean>
    )
}