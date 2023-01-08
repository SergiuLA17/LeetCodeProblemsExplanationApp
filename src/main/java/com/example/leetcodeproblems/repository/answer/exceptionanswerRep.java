package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.exceptionanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface exceptionanswerRep extends CrudRepository<exceptionanswer, Long> {
}
