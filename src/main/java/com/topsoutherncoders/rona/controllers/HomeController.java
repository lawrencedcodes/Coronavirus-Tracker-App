package com.topsoutherncoders.rona.controllers;

import com.topsoutherncoders.rona.services.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    DatabaseService databaseService;
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", databaseService.getAllStats());
        return "home";
    }

}
