package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.redblacktree;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface redblacktreeinfo extends CrudRepository<redblacktree, Integer> {
}
