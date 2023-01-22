package com.example.leetcodeproblems.repository;

import com.example.leetcodeproblems.model.entity.info.refactor;
import com.example.leetcodeproblems.model.entity.roadmap;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoadMapRep extends CrudRepository<roadmap, Long> {
    @Query("select r from roadmap r where r.title = ?1")
    Iterable<roadmap> findByTile(String title);
}
