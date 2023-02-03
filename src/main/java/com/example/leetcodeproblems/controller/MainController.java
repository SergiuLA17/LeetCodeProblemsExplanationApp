package com.example.leetcodeproblems.controller;

import com.example.leetcodeproblems.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    private JavaService javaService;


    @GetMapping("/roadmap/{title}")
    public String refactor(@PathVariable String title, Model model) {
        model = javaService.processModel(model, javaService.findRoadMapTheme(title));
        return "index";
    }

}
