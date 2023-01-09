package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.jpainfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpainfoRep extends CrudRepository<jpainfo, Long> {
}
