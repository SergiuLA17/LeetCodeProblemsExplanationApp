package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.roadmapmostenire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roadmapmostenireRep extends CrudRepository<roadmapmostenire, Long> {
}