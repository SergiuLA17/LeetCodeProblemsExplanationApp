package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.objectinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface objectinfoRep extends CrudRepository<objectinfo, Long> {
}
