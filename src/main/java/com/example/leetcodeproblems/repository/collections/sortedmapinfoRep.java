package com.example.leetcodeproblems.repository.collections;

import com.example.leetcodeproblems.model.entity.collections.sortedmapinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sortedmapinfoRep extends CrudRepository<sortedmapinfo, Long> {
}
