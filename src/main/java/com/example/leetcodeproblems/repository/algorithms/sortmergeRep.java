package com.example.leetcodeproblems.repository.algorithms;

import com.example.leetcodeproblems.model.entity.algorithms.sortmerge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sortmergeRep extends CrudRepository<sortmerge, Long> {
}
