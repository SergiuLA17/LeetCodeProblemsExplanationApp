package com.example.leetcodeproblems.DataAccesLayer.repository.info;

import com.example.leetcodeproblems.CommonLayer.entity.info.Java;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaRepository extends CrudRepository<Java, Integer> {
}
