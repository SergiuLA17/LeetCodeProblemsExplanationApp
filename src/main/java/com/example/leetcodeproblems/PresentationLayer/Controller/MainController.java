package com.example.leetcodeproblems.PresentationLayer.Controller;


import com.example.leetcodeproblems.BussinesLayer.logger.LoggerService;
import com.example.leetcodeproblems.CommonLayer.entity.Java;
import com.example.leetcodeproblems.DataAccesLayer.dao.JavaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private JavaInfoService javaInfoService;

    @Autowired
    private LoggerService loggerService;


    @GetMapping("/java")
    public String java(Model model) {

        for (int i = 1; i < 3; i++) {
            Java element = javaInfoService.findByID(i).get();
            model.addAttribute("categories"+i, element.getCategory());
            model.addAttribute("title"+i, element.getQuestion());
            model.addAttribute("description"+i, element.getAnswer());
        }
        return "java";

    }
}
