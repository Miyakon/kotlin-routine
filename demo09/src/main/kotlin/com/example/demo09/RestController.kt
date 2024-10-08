package com.example.demo09

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }
}