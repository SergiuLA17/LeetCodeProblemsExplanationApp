package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.stackinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StackInfoRep extends CrudRepository<stackinfo, Long> {
}
