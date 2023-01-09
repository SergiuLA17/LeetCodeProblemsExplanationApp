package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.isolationlevel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface isolationlevelRep extends CrudRepository<isolationlevel, Long> {
}
