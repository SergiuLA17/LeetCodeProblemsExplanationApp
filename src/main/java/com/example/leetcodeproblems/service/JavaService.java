package com.example.leetcodeproblems.service;

import com.example.leetcodeproblems.model.entity.Web.*;
import com.example.leetcodeproblems.model.entity.algorithms.sortmerge;
import com.example.leetcodeproblems.model.entity.answers.*;
import com.example.leetcodeproblems.model.entity.collections.dequeinfo;
import com.example.leetcodeproblems.model.entity.collections.mapinfo;
import com.example.leetcodeproblems.model.entity.collections.queueinfo;
import com.example.leetcodeproblems.model.entity.collections.sortedmapinfo;
import com.example.leetcodeproblems.model.entity.exception.check;
import com.example.leetcodeproblems.model.entity.exception.exception;
import com.example.leetcodeproblems.model.entity.git.gitcommands;
import com.example.leetcodeproblems.model.entity.git.gitlist;
import com.example.leetcodeproblems.model.entity.git.mergevsrebase;
import com.example.leetcodeproblems.model.entity.info.*;
import com.example.leetcodeproblems.model.entity.multithreading.happensbefore;
import com.example.leetcodeproblems.model.entity.multithreading.multithreadinginfo;
import com.example.leetcodeproblems.model.entity.multithreading.multithreadinglist;
import com.example.leetcodeproblems.model.entity.patterns.gofinfo;
import com.example.leetcodeproblems.model.entity.patterns.graspinfo;
import com.example.leetcodeproblems.model.entity.patterns.patternslist;
import com.example.leetcodeproblems.model.entity.practice.enumpractice;
import com.example.leetcodeproblems.model.entity.practice.sqlpractice;
import com.example.leetcodeproblems.model.entity.principies.dry.dryinfo;
import com.example.leetcodeproblems.model.entity.principies.kiss.kissinfo;
import com.example.leetcodeproblems.model.entity.principies.principieslist;
import com.example.leetcodeproblems.model.entity.principies.solid.*;
import com.example.leetcodeproblems.model.entity.principies.yagni.yagniinfo;
import com.example.leetcodeproblems.model.entity.quiz.quiz;
import com.example.leetcodeproblems.model.entity.roadmap;
import com.example.leetcodeproblems.model.entity.spring.*;
import com.example.leetcodeproblems.model.entity.sql.*;
import com.example.leetcodeproblems.model.entity.tools.apachetomcatinfo;
import com.example.leetcodeproblems.model.entity.tools.ideinfo;
import com.example.leetcodeproblems.model.entity.tools.junitinfo;
import com.example.leetcodeproblems.model.entity.tools.maveninfo;
import com.example.leetcodeproblems.repository.RoadMapRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class JavaService {
    @Autowired
    private RoadMapRep roadMapRep;

    public Iterable<roadmap> findRoadMapTheme(String title) {
        return roadMapRep.findByTile(title);
    }

//    public void saveDataQuiz(int data) {
//        quiz quiz = new quiz();
//        quiz.setDate(LocalDate.now());
//        quiz.setData(data);
//        references.getQuizRep().save(quiz);
//    }

    public Model processModel(Model model, Iterable<?> iterable) {
        List<Object> arrayList = new ArrayList<>();
        iterable.forEach(arrayList::add);

        model.addAttribute("length", arrayList.size());
        model.addAttribute("dataList", arrayList);
        return model;
    }
}
