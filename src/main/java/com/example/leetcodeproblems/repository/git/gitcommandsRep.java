package com.example.leetcodeproblems.repository.git;

import com.example.leetcodeproblems.model.entity.git.gitcommands;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gitcommandsRep extends CrudRepository<gitcommands, Long> {
}
