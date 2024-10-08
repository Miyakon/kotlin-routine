package com.example.demo1008

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingPongController {

    @GetMapping("/ping")
    fun pingPong(): String {
        return "pong"
    }
}