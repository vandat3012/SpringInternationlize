package com.example.springinternationlize.controller;

import com.example.springinternationlize.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user",new User());
        return "login";
    }
    @PostMapping("/doLogin")
    public String doLogin(Model model,User user) {
        model.addAttribute("user",user);
        return "dashboard";
    }
}
