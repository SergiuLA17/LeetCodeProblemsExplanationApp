package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.whileinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface whileinfoRep extends CrudRepository<whileinfo, Long> {
}
