package com.example.leetcodeproblems.repository.multithreading;

import com.example.leetcodeproblems.model.entity.multithreading.multithreadinginfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface multithreadinginfoRep extends CrudRepository<multithreadinginfo, Long> {
}
