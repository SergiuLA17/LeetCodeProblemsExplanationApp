package com.example.leetcodeproblems.repository.principies.kiss;

import com.example.leetcodeproblems.model.entity.principies.kiss.kissinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kissinfoRep extends CrudRepository<kissinfo, Long> {
}
