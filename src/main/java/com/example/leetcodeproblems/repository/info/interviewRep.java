package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.interview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interviewRep extends CrudRepository<interview, Integer> {

}
