package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.kissanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kissanswerRep extends CrudRepository<kissanswer, Long> {
}
