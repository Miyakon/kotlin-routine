package com.example.blog

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController {

    @GetMapping("/systems/ping")
    fun pingPong(): String {
        return "pong\n"
    }
}