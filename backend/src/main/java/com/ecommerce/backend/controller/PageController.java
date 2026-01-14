package com.ecommerce.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";  // src/main/resources/templates/index.html
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // src/main/resources/templates/login.html
    }
}
