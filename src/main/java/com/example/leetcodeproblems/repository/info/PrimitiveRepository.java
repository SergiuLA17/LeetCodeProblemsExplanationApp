package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Primitive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimitiveRepository extends CrudRepository<Primitive, Integer> {
}
