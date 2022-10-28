package com.example.leetcodeproblems.PresentationLayer.Controller;

import com.example.leetcodeproblems.Interview.OOP.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    StudyService service;

    @GetMapping("/encapsulation")
    public String greetingForm() {
        service.encapsulation();
        return "greeting";
    }




}
