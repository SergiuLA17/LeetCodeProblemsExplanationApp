package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.loopinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loopinfoRep extends CrudRepository<loopinfo, Long> {
}
