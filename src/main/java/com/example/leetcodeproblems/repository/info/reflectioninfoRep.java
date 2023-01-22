package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.reflectioninfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reflectioninfoRep extends CrudRepository<reflectioninfo, Long> {
}
