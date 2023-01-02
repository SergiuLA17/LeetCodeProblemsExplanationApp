package com.example.leetcodeproblems.repository.collections;

import com.example.leetcodeproblems.model.entity.collections.queueinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface queueinfoRep extends CrudRepository<queueinfo, Long> {
}
