package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.yagnianswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface yagnianswerRep extends CrudRepository<yagnianswer, Long> {
}
