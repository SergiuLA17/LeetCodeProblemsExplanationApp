package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.lambdainfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lambdainfoRep extends CrudRepository<lambdainfo, Long> {
}
