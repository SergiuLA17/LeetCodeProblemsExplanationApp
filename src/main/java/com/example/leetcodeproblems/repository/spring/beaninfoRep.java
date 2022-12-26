package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.beaninfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface beaninfoRep extends CrudRepository<beaninfo, Long> {
}
