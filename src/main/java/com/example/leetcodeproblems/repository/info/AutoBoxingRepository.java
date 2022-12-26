package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Autoboxing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoBoxingRepository extends CrudRepository<Autoboxing, Integer> {
}
