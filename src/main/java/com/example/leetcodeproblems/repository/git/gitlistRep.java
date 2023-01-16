package com.example.leetcodeproblems.repository.git;

import com.example.leetcodeproblems.model.entity.git.gitlist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gitlistRep extends CrudRepository<gitlist, Long> {
}
