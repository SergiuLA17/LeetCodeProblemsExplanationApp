package com.example.leetcodeproblems.DataAccesLayer.repository.spring;

import com.example.leetcodeproblems.CommonLayer.entity.spring.scopeinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScopeInfoRep extends CrudRepository<scopeinfo, Long> {
}


