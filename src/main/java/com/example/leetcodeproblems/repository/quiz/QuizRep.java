package com.example.leetcodeproblems.repository.quiz;

import com.example.leetcodeproblems.model.entity.quiz.quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRep extends CrudRepository<quiz, Long> {
}
