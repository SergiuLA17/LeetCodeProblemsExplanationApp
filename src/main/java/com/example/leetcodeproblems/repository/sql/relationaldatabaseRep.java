package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.relationaldatabase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface relationaldatabaseRep extends CrudRepository<relationaldatabase, Long> {
}
