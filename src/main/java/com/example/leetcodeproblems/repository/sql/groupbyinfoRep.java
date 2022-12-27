package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.groupbyinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface groupbyinfoRep extends CrudRepository<groupbyinfo, Long> {
}
