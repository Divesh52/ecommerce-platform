package com.ecommerce.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "user-dashboard"; // src/main/resources/templates/user-dashboard.html
    }
}
