package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.dryanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dryanswerRep extends CrudRepository<dryanswer, Long> {
}
