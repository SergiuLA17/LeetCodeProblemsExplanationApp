package com.example.leetcodeproblems.repository.tools;

import com.example.leetcodeproblems.model.entity.tools.ideinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ideinfoRep extends CrudRepository<ideinfo, Long> {
}
