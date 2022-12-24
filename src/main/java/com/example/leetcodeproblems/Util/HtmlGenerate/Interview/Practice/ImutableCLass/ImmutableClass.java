package com.example.leetcodeproblems.Util.HtmlGenerate.Interview.Practice.ImutableCLass;

import java.util.ArrayList;
import java.util.List;

final public class ImmutableClass {
    //se pune modificatoruk final pentru a nu putea fi mostenita si modificata

    private final List<String> stringList;

    //cand vine un obiect de tipul immutable class, se creeaza o lista noua
    public ImmutableClass(List<String> stringList) {
        //se pune o copie deoarece nu vrem sa modificam lista din afara
        this.stringList = new ArrayList<>(stringList);
    }

    //se returneaza o lista noua
    public List<String> getStringList() {
        //se returneaza o copie deoarece nu vrem sa modificam lista din afara
        return new ArrayList<>(stringList);
    }
}
