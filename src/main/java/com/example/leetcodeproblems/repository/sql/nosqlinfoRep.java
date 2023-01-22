package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.nosqlinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nosqlinfoRep extends CrudRepository<nosqlinfo, Long> {
}
