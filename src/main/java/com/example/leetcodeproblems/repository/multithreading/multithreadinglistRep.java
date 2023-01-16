package com.example.leetcodeproblems.repository.multithreading;

import com.example.leetcodeproblems.model.entity.multithreading.multithreadinglist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface multithreadinglistRep extends CrudRepository<multithreadinglist, Long> {
}
