package org.launchcode.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Help  Desk");
        return "index";
    }

}
