package com.example.leetcodeproblems.repository.info;

import com.example.leetcodeproblems.model.entity.info.Arraylists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrayaListsRepository extends CrudRepository<Arraylists, Integer> {
}
