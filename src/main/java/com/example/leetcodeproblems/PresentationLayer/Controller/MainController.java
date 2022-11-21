package com.example.leetcodeproblems.PresentationLayer.Controller;

import com.example.leetcodeproblems.Interview.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    StudyService service;

    @GetMapping("/encapsulation")
    public String greetingForm() {



        return "questions";
    }







}
