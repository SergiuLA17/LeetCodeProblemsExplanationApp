package com.example.leetcodeproblems.DataAccesLayer.repository;

import com.example.leetcodeproblems.CommonLayer.entity.Arraylists;
import com.example.leetcodeproblems.CommonLayer.entity.convertstringtoarrtolist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvertArrayToListRepository extends CrudRepository<convertstringtoarrtolist, Integer> {
}
