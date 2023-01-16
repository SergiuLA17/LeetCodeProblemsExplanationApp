package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.fieldinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fieldinfoRep extends CrudRepository<fieldinfo, Long> {
}
