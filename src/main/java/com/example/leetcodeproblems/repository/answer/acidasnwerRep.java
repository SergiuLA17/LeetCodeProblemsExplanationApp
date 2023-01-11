package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.acidanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface acidasnwerRep extends CrudRepository<acidanswer, Long> {
}
