package com.example.leetcodeproblems.repository.collections;

import com.example.leetcodeproblems.model.entity.collections.mapinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mapinfoRep extends CrudRepository<mapinfo, Long> {
}
