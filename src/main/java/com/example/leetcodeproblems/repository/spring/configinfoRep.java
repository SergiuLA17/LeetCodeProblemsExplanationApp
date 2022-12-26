package com.example.leetcodeproblems.repository.spring;

import com.example.leetcodeproblems.model.entity.spring.configinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface configinfoRep extends CrudRepository<configinfo, Long> {
}
