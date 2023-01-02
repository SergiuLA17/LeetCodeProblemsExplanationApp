package com.example.leetcodeproblems.repository.principies.solid;

import com.example.leetcodeproblems.model.entity.principies.solid.solidinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface solidinfoRep extends CrudRepository<solidinfo, Long> {
}
