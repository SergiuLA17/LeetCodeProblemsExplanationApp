package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.forinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface forinfoRep extends CrudRepository<forinfo, Long> {
}
