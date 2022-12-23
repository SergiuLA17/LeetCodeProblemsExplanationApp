package com.example.leetcodeproblems.DataAccesLayer.repository.info;

import com.example.leetcodeproblems.CommonLayer.entity.info.stackinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StackInfoRep extends CrudRepository<stackinfo, Long> {
}
