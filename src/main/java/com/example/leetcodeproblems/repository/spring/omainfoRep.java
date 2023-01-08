package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.omainfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface omainfoRep extends CrudRepository<omainfo, Long> {
}
