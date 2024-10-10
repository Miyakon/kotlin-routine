package com.example.demo11

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }
}