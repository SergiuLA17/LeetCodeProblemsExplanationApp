package com.example.leetcodeproblems.DataAccesLayer.repository;

import com.example.leetcodeproblems.CommonLayer.entity.Autoboxing;
import com.example.leetcodeproblems.CommonLayer.entity.Lists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends CrudRepository<Lists, Integer> {
}
