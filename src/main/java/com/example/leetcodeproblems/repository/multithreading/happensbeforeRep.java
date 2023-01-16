package com.example.leetcodeproblems.repository.multithreading;

import com.example.leetcodeproblems.model.entity.multithreading.happensbefore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface happensbeforeRep extends CrudRepository<happensbefore, Long> {
}
