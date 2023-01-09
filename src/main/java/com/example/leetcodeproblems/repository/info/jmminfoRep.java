package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.jmminfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jmminfoRep extends CrudRepository<jmminfo, Long> {
}
