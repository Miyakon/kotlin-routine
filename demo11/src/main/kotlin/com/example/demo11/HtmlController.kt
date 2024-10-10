package com.example.demo11

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/hi")
    fun hi(): String {
        return "hi.html"
    }
}