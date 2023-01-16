package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.foreachinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface foreachinfoRep extends CrudRepository<foreachinfo, Long> {
}
