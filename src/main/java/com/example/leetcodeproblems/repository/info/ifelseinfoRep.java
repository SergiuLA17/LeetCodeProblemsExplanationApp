package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.ifelseinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ifelseinfoRep extends CrudRepository<ifelseinfo, Long> {
}
