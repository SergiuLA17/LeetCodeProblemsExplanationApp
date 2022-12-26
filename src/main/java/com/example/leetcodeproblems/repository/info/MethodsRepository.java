package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Methods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodsRepository extends CrudRepository<Methods, Integer> {
}
