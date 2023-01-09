package com.example.leetcodeproblems.repository.exception;

import com.example.leetcodeproblems.model.entity.exception.exception;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface exceptionRep extends CrudRepository<exception, Long> {
}
