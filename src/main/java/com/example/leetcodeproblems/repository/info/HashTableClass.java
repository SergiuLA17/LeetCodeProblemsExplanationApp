package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.hashtableinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashTableClass  extends CrudRepository<hashtableinfo, Integer> {
}
