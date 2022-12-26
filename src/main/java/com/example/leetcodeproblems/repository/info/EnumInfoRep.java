package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.enuminfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumInfoRep extends CrudRepository<enuminfo, Integer> {
}

