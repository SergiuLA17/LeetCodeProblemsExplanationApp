package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.hibernateinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hibernateinfoRep extends CrudRepository<hibernateinfo, Long> {
}
