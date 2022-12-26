package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Constructors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ConstructorsRepository  extends CrudRepository<Constructors, Integer> {
}

