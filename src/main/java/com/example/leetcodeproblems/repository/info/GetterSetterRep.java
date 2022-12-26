package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.gettersetter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetterSetterRep extends CrudRepository<gettersetter, Long> {
}
