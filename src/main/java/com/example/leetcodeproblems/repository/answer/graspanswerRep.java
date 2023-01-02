package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.graspanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface graspanswerRep extends CrudRepository<graspanswer, Long> {
}
