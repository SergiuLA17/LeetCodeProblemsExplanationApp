package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.importinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface importinfoRep extends CrudRepository<importinfo, Long> {
}
