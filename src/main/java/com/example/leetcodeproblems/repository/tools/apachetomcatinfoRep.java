package com.example.leetcodeproblems.repository.tools;

import com.example.leetcodeproblems.model.entity.tools.apachetomcatinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface apachetomcatinfoRep extends CrudRepository<apachetomcatinfo, Long> {
}
