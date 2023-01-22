package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.roadmapincapsulare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roadmapincapsulareRep extends CrudRepository<roadmapincapsulare, Long> {
}
