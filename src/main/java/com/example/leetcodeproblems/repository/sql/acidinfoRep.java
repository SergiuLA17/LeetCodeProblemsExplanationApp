package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.acidinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface acidinfoRep extends CrudRepository<acidinfo, Long> {
}
