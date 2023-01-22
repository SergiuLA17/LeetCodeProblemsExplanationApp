package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.linkedlistinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface linkedlistinfoRep extends CrudRepository<linkedlistinfo, Long> {
}
