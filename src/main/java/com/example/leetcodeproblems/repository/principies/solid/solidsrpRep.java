package com.example.leetcodeproblems.repository.principies.solid;

import com.example.leetcodeproblems.model.entity.principies.solid.solidsrp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface solidsrpRep extends CrudRepository<solidsrp, Long> {
}
