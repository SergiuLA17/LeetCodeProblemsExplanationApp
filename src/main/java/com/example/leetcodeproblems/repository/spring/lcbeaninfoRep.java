package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.lcbeaninfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lcbeaninfoRep extends CrudRepository<lcbeaninfo, Long> {
}
