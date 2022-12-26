package com.example.leetcodeproblems.repository.practice;

import com.example.leetcodeproblems.model.entity.practice.enumpractice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumPracticeRep extends CrudRepository<enumpractice, Integer> {
}

