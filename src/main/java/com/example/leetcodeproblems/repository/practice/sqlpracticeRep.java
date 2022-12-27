package com.example.leetcodeproblems.repository.practice;

import com.example.leetcodeproblems.model.entity.practice.sqlpractice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sqlpracticeRep extends CrudRepository<sqlpractice, Long> {
}
