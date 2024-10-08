package com.example.demo1008

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/hi")
    fun html(): String {
        return "hi.html"
    }
}