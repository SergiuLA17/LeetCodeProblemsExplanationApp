package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.iterationinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iterationinfoRep extends CrudRepository<iterationinfo, Long> {
}
