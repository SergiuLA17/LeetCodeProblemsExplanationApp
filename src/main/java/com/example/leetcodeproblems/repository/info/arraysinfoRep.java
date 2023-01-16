package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.arraysinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface arraysinfoRep extends CrudRepository<arraysinfo, Long> {
}
