package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Nullword;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NullRep extends CrudRepository<Nullword, Long> {
}

