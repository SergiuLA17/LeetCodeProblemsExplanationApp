package com.example.leetcodeproblems.repository.answer;

import com.example.leetcodeproblems.model.entity.answers.soapanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface soapanswerRep extends CrudRepository<soapanswer, Long> {
}
