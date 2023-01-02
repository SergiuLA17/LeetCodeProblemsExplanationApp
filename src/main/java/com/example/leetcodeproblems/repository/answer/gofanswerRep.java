package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.gofanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gofanswerRep extends CrudRepository<gofanswer, Long> {
}
