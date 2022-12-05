package com.example.leetcodeproblems.DataAccesLayer.repository;

import com.example.leetcodeproblems.CommonLayer.entity.Methods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodsRepository extends CrudRepository<Methods, Integer> {
}
