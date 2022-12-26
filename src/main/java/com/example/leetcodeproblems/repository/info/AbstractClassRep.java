package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.abstractclass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractClassRep extends CrudRepository<abstractclass, Long> {
}
