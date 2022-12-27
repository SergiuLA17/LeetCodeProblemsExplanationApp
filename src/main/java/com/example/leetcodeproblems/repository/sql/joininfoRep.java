package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.joinsinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface joininfoRep extends CrudRepository<joinsinfo, Long> {
}
