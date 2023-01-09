package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.solidanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface solidanswerRep extends CrudRepository<solidanswer, Long> {
}
