package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Iterables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IterablesRepository extends CrudRepository<Iterables, Integer> {
}
