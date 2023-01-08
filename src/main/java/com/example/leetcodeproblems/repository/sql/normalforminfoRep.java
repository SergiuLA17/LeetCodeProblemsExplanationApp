package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.normalforminfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface normalforminfoRep extends CrudRepository<normalforminfo, Long> {
}
