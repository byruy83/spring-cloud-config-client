package com.example.spring.cloud.config.client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
class ConfigClientController(
    @Value("\${byruy83.value}") private val configStr: String,
) {

    @GetMapping("/test")
    fun getConfigStr(): String {
        return configStr
    }
}