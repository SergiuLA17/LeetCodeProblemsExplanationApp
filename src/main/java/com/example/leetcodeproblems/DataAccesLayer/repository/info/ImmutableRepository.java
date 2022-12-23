package com.example.leetcodeproblems.DataAccesLayer.repository.info;

import com.example.leetcodeproblems.CommonLayer.entity.info.Immutable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ImmutableRepository  extends CrudRepository<Immutable, Integer> {
}