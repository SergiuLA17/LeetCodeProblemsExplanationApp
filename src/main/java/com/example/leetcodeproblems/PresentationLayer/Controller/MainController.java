package com.example.leetcodeproblems.PresentationLayer.Controller;


import com.example.leetcodeproblems.BussinesLayer.logger.LoggerService;
import com.example.leetcodeproblems.DataAccesLayer.dao.JavaService;
import com.example.leetcodeproblems.Util.ProcessModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private JavaService javaService;
    @Autowired
    private LoggerService loggerService;
    @Autowired
    private ProcessModel processModel;


    @GetMapping("/java")
    public String java(Model model) {
        model = processModel.process(model,javaService.findJavaAll());
        return "index";
    }

    @GetMapping("/methods")
    public String methods(Model model) {
        model = processModel.process(model,javaService.findMethodsAll());
        return "index";
    }

    @GetMapping("/primitive")
    public String primitive(Model model) {
        model = processModel.process(model,javaService.findPrimitiveAll());
        return "index";
    }

    @GetMapping("/autoboxing")
    public String autoboxing(Model model) {
        model = processModel.process(model,javaService.findAutoBoxingAll());
        return "index";
    }

    @GetMapping("/constructors")
    public String constructor(Model model) {
        model = processModel.process(model,javaService.findConstructorAll());
        return "index";
    }

    @GetMapping("/bytes")
    public String bytes(Model model) {
        model = processModel.process(model,javaService.findBytesAll());
        return "index";
    }

    @GetMapping("/immutable")
    public String immutable(Model model) {
        model = processModel.process(model,javaService.findImmutableAll());
        return "index";
    }

    @GetMapping("/referinta")
    public String referinta(Model model) {
        model = processModel.process(model,javaService.findReferintaAll());
        return "index";
    }

    @GetMapping("/collections")
    public String collections(Model model) {
        model = processModel.process(model,javaService.findCollectionsAll());
        return "index";
    }

    @GetMapping("/hashsets")
    public String hashsets(Model model) {
        model = processModel.process(model,javaService.findHashSetsAll());
        return "index";
    }

    @GetMapping("/iterables")
    public String iterables(Model model) {
        model = processModel.process(model,javaService.findIterablesAll());
        return "index";
    }

    @GetMapping("/lists")
    public String lists(Model model) {
        model = processModel.process(model,javaService.listsFindAll());
        return "index";
    }

    @GetMapping("/arrayLists")
    public String arrayLists(Model model) {
        model = processModel.process(model,javaService.findArrayListsAll());
        return "index";
    }

    @GetMapping("/sets")
    public String sets(Model model) {
        model = processModel.process(model,javaService.findSetsAll());
        return "index";
    }

    @GetMapping("/convertstringtoarrtolist")
    public String convertstringtoarrtolist(Model model) {
        model = processModel.process(model,javaService.findConvertStringToArrayList());
        return "index";
    }
}