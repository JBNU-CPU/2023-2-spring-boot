package com.example.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainP(Model model) {

        String name = "kim";

        model.addAttribute("username", name);

        return "main";
    }
}
