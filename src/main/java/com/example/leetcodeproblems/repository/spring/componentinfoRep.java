package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.componentinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface componentinfoRep extends CrudRepository<componentinfo, Long> {
}
