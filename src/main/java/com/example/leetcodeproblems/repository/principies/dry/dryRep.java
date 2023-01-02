package com.example.leetcodeproblems.repository.principies.dry;

import com.example.leetcodeproblems.model.entity.principies.dry.dryinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dryRep extends CrudRepository<dryinfo, Long> {
}
