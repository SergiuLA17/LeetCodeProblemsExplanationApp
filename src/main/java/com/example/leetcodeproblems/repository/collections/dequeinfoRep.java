package com.example.leetcodeproblems.repository.collections;

import com.example.leetcodeproblems.model.entity.collections.dequeinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dequeinfoRep extends CrudRepository<dequeinfo, Long> {
}
