package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.functionalprogramming;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface functionalprogrammingRep extends CrudRepository<functionalprogramming, Long> {
}
