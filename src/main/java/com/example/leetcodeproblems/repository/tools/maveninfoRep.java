package com.example.leetcodeproblems.repository.tools;

import com.example.leetcodeproblems.model.entity.tools.maveninfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface maveninfoRep extends CrudRepository<maveninfo, Long> {
}
