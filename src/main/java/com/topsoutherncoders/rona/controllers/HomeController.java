package com.topsoutherncoders.rona.controllers;

import com.topsoutherncoders.rona.services.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    DatabaseService coronaVirusDataService;
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStat", "TEST");
        return "home";
    }

}
