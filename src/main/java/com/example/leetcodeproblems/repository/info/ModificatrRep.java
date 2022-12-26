package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.modificators;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModificatrRep extends CrudRepository<modificators,Long> {
}
