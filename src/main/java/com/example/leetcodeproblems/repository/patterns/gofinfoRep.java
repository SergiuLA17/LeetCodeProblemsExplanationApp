package com.example.leetcodeproblems.repository.patterns;

import com.example.leetcodeproblems.model.entity.patterns.gofinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gofinfoRep extends CrudRepository<gofinfo, Long> {
}
