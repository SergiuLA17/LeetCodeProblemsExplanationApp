package com.example.leetcodeproblems.DataAccesLayer.repository.quiz;

import com.example.leetcodeproblems.CommonLayer.entity.quiz.quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRep extends CrudRepository<quiz, Long> {
}
