package com.example.leetcodeproblems.repository.patterns;

import com.example.leetcodeproblems.model.entity.patterns.graspinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface graspinfoRep extends CrudRepository<graspinfo, Long> {
}
