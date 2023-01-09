package com.example.leetcodeproblems.repository.answer;


import com.example.leetcodeproblems.model.entity.answers.restanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restanswerRep extends CrudRepository<restanswer, Long> {
}
