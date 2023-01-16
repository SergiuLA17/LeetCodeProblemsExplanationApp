package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.keywordsinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface keywordsinfoRep extends CrudRepository<keywordsinfo, Long> {
}
