package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Lists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends CrudRepository<Lists, Integer> {
}
