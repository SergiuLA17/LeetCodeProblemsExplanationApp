package com.example.leetcodeproblems.repository.tools;

import com.example.leetcodeproblems.model.entity.tools.junitinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface junitinfoRep extends CrudRepository<junitinfo, Long> {
}
