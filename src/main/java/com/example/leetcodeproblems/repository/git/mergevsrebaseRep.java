package com.example.leetcodeproblems.repository.git;

import com.example.leetcodeproblems.model.entity.git.mergevsrebase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mergevsrebaseRep extends CrudRepository<mergevsrebase, Long> {
}
