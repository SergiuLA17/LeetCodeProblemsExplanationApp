package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.oopanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface oopanswerRep extends CrudRepository<oopanswer, Long> {
}
