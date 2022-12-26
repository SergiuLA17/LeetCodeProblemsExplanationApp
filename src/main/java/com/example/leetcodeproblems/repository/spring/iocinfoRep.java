package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.iocinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iocinfoRep extends CrudRepository<iocinfo, Long> {
}
