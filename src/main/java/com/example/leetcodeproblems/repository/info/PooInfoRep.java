package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.pooinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PooInfoRep extends CrudRepository<pooinfo, Long> {
}

