package com.example.leetcodeproblems.repository.answer;


import com.example.leetcodeproblems.model.entity.answers.collectionanswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface collectionanswerRep extends CrudRepository<collectionanswer, Long> {
}
