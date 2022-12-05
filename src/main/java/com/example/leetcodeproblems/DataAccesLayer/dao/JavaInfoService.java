package com.example.leetcodeproblems.DataAccesLayer.dao;

import com.example.leetcodeproblems.CommonLayer.entity.Java;
import com.example.leetcodeproblems.DataAccesLayer.repository.JavaInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JavaInfoService {
    @Autowired
    private JavaInfoRepository javaInfoRepository;


    public Optional<Java> findByID(int id) {
        Optional<Java> element = javaInfoRepository.findById(id);
        return element;

    }
}
