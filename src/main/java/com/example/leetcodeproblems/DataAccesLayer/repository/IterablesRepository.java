package com.example.leetcodeproblems.DataAccesLayer.repository;

import com.example.leetcodeproblems.CommonLayer.entity.Iterables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IterablesRepository extends CrudRepository<Iterables, Integer> {
}
