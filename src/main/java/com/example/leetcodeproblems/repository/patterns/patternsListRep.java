package com.example.leetcodeproblems.repository.patterns;

import com.example.leetcodeproblems.model.entity.patterns.patternslist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patternsListRep extends CrudRepository<patternslist, Long> {
}
