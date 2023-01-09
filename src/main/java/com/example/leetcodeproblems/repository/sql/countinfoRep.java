package com.example.leetcodeproblems.repository.sql;

import com.example.leetcodeproblems.model.entity.sql.countinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface countinfoRep extends CrudRepository<countinfo, Long> {
}
