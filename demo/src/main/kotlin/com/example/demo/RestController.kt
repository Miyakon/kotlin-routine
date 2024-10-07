package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @GetMapping("/v1/systems/ping")
    fun pingPong(): String {
        return "pong"
    }
}