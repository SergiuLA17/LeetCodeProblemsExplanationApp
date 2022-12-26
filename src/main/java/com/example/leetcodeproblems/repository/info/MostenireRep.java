package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.mostenire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MostenireRep extends CrudRepository<mostenire, Long> {
}
