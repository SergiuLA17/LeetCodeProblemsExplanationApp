package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Classes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRep extends CrudRepository<Classes, Long> {
}
