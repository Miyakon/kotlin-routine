package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        model.addAttribute("message", "Hello World")
        return "hello"  // "hello"という名前のHTMLテンプレートを返す
    }

    @GetMapping("/hi")
    fun hi(): String {
        return "redirect:/index.html"
    }
}
