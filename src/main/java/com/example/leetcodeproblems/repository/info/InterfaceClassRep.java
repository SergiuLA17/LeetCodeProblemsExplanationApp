package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.interfaceclass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceClassRep extends CrudRepository<interfaceclass, Long> {
}
