package com.example.leetcodeproblems.service;

import com.example.leetcodeproblems.model.entity.roadmap;
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
