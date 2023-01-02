package com.example.leetcodeproblems.repository.principies.yagni;

import com.example.leetcodeproblems.model.entity.principies.yagni.yagniinfo;
import org.springframework.data.repository.CrudRepository;

public interface yagniRep extends CrudRepository<yagniinfo, Long> {
}