package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.refactor;
import com.example.leetcodeproblems.model.entity.roadmap;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface refactorRep extends CrudRepository<roadmap, Long> {

    @Query("select r from refactor r where r.title = ?1")
    Iterable<roadmap> findByTile(String title);
}
