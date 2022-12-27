package com.example.leetcodeproblems.controller;

import com.example.leetcodeproblems.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    private JavaService javaService;



    @RequestMapping(value = "/manageCandidatesPage", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody int manageCandidatesPage(@RequestBody int scoreContainer) {
        javaService.saveDataQuiz(scoreContainer);
        return scoreContainer;
    }

    @GetMapping("/quiz")
    public String quiz() {
        return "quiz";
    }

    @GetMapping({"/getQuizScore", "/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("quizscore");
        mav.addObject("score", javaService.findAllQuiz());
        return mav;
    }

    @GetMapping("/java")
    public String java(Model model) {
        model = javaService.processModel(model, javaService.findJavaAll());
        return "index";
    }

    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }

    @GetMapping("/methods")
    public String methods(Model model) {
        model = javaService.processModel(model, javaService.findMethodsAll());
        return "index";
    }

    @GetMapping("/primitive")
    public String primitive(Model model) {
        model = javaService.processModel(model,javaService.findPrimitiveAll());
        return "index";
    }

    @GetMapping("/autoboxing")
    public String autoboxing(Model model) {
        model = javaService.processModel(model,javaService.findAutoBoxingAll());
        return "index";
    }

    @GetMapping("/constructors")
    public String constructor(Model model) {
        model = javaService.processModel(model,javaService.findConstructorAll());
        return "index";
    }

    @GetMapping("/bytes")
    public String bytes(Model model) {
        model = javaService.processModel(model,javaService.findBytesAll());
        return "index";
    }

    @GetMapping("/immutable")
    public String immutable(Model model) {
        model = javaService.processModel(model,javaService.findImmutableAll());
        return "index";
    }

    @GetMapping("/referinta")
    public String referinta(Model model) {
        model = javaService.processModel(model,javaService.findReferintaAll());
        return "index";
    }

    @GetMapping("/collections")
    public String collections(Model model) {
        model = javaService.processModel(model,javaService.findCollectionsAll());
        return "index";
    }

    @GetMapping("/hashsets")
    public String hashsets(Model model) {
        model = javaService.processModel(model,javaService.findHashSetsAll());
        return "index";
    }

    @GetMapping("/iterables")
    public String iterables(Model model) {
        model = javaService.processModel(model,javaService.findIterablesAll());
        return "index";
    }

    @GetMapping("/lists")
    public String lists(Model model) {
        model = javaService.processModel(model,javaService.listsFindAll());
        return "index";
    }

    @GetMapping("/arrayLists")
    public String arrayLists(Model model) {
        model = javaService.processModel(model,javaService.findArrayListsAll());
        return "index";
    }

    @GetMapping("/sets")
    public String sets(Model model) {
        model = javaService.processModel(model,javaService.findSetsAll());
        return "index";
    }

    @GetMapping("/convertstringtoarrtolist")
    public String convertstringtoarrtolist(Model model) {
        model = javaService.processModel(model,javaService.findConvertStringToArrayList());
        return "index";
    }

    @GetMapping("/interwiev")
    public String interview(Model model) {
        model = javaService.processModel(model,javaService.findInterviewAll());
        return "index";
    }

    @GetMapping("/classes")
    public String classes(Model model) {
        model = javaService.processModel(model,javaService.findCLassesAll());
        return "index";
    }

    @GetMapping("/null")
    public String nullword(Model model) {
        model = javaService.processModel(model,javaService.findAllNull());
        return "index";
    }

    @GetMapping("/static")
    public String staticword(Model model) {
        model = javaService.processModel(model,javaService.findStaticAll());
        return "index";
    }

    @GetMapping("/pooInfo")
    public String pooInfo(Model model) {
        model = javaService.processModel(model,javaService.findPooInfoALl());
        return "index";
    }

    @GetMapping("/setterGetter")
    public String setterGetter(Model model) {
        model = javaService.processModel(model,javaService.findsAllSetterGettre());
        return "index";
    }

    @GetMapping("/modificators")
    public String modificators(Model model) {
        model = javaService.processModel(model,javaService.findAllmodificatros());
        return "index";
    }

    @GetMapping("/mostenire")
    public String mostenire(Model model) {
        model = javaService.processModel(model,javaService.findAllMostenire());
        return "index";
    }

    @GetMapping("/abstractClass")
    public String abstractClass(Model model) {
        model = javaService.processModel(model,javaService.findAllAbstractClass());
        return "index";
    }

    @GetMapping("/interfaceClass")
    public String interfaceClass(Model model) {
        model = javaService.processModel(model,javaService.findAllInterfaceClass());
        return "index";
    }

    @GetMapping("/hashTableInfo")
    public String hashTableInfo(Model model) {
        model = javaService.processModel(model,javaService.findAllHashTable());
        return "index";
    }

    @GetMapping("/stackInfo")
    public String stackInfo(Model model) {
        model = javaService.processModel(model, javaService.findAllStackInfo());
        return "index";
    }

    @GetMapping("/treeSetInfo")
    public String treeSetInfo(Model model) {
        model = javaService.processModel(model,javaService.findAllTreeSetInfo());
        return "index";
    }

    @GetMapping("/RedBlackTreeInfo")
    public String redBlackTreeInfo(Model model) {
        model = javaService.processModel(model,javaService.findAllRedBlackInfo());
        return "index";
    }

    @GetMapping("/enumInfo")
    public String enumInfo(Model model) {
        model = javaService.processModel(model,javaService.findEnumInfoAll());
        return "index";
    }

    @GetMapping("/enumPractice")
    public String enumPractice(Model model) {
        model = javaService.processModel(model,javaService.findAllEnumPractice());
        return "index";
    }

    @GetMapping("/scopeInfo")
    public String scopeInfo(Model model) {
        model = javaService.processModel(model,javaService.findAllScopeInfo());
        return "index";
    }

    @GetMapping("/beanInfo")
    public String beanInfo(Model model) {
        model = javaService.processModel(model,javaService.finaAllBeanInfo());
        return "index";
    }

    @GetMapping("/iocInfo")
    public String iocInfo(Model model) {
        model = javaService.processModel(model,javaService.findIoCInfoAll());
        return "index";
    }

    @GetMapping("/configInfo")
    public String configInfo(Model model) {
        model = javaService.processModel(model,javaService.findConfigInfo());
        return "index";
    }

    @GetMapping("/componentInfo")
    public String componentInfo(Model model) {
        model = javaService.processModel(model,javaService.findComponenInfo());
        return "index";
    }

    @GetMapping("/importInfo")
    public String importInfo(Model model) {
        model = javaService.processModel(model,javaService.findImportInfo());
        return "index";
    }

    @GetMapping("/joinInfo")
    public String joinInfo(Model model) {
        model = javaService.processModel(model,javaService.findAllJoinInfo());
        return "index";
    }

    @GetMapping("/sqlPractice")
    public String sqlPractice(Model model) {
        model = javaService.processModel(model,javaService.findAllSqlPractice());
        return "index";
    }
}