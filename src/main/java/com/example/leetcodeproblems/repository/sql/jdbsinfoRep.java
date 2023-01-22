package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.jdbsinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jdbsinfoRep extends CrudRepository<jdbsinfo, Long> {
}
