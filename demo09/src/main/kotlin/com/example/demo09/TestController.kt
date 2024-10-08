package com.example.demo09

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TestController {
    @GetMapping("/hi")
    fun hi(): String {
        return "hi.html"
    }
}