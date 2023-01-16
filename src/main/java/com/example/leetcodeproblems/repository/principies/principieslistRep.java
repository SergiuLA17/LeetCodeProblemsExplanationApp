package com.example.leetcodeproblems.repository.principies;

import com.example.leetcodeproblems.model.entity.principies.principieslist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface principieslistRep extends CrudRepository<principieslist, Long> {
}
