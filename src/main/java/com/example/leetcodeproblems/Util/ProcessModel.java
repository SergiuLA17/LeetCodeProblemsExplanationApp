package com.example.leetcodeproblems.Util;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProcessModel {

   public Model process(Model model, Iterable<?> iterable) {
       List<Object> arrayList = new ArrayList<>();
       iterable.forEach(arrayList::add);

       model.addAttribute("length", arrayList.size());
       model.addAttribute("dataList", arrayList);
       return model;
   }
}
