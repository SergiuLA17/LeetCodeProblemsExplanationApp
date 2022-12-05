package com.example.leetcodeproblems.DataAccesLayer.repository;

import com.example.leetcodeproblems.CommonLayer.entity.Hashsets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashSetsRepository extends CrudRepository<Hashsets, Integer> {
}
