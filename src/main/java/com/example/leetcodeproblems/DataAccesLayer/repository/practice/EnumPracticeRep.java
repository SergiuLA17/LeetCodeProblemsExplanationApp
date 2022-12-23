package com.example.leetcodeproblems.DataAccesLayer.repository.practice;

import com.example.leetcodeproblems.CommonLayer.entity.practice.enumpractice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumPracticeRep extends CrudRepository<enumpractice, Integer> {
}

