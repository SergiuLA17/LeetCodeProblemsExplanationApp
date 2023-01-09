package com.example.leetcodeproblems.repository.principies.solid;

import com.example.leetcodeproblems.model.entity.principies.solid.solidisp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface solidispRep extends CrudRepository<solidisp, Long> {
}
