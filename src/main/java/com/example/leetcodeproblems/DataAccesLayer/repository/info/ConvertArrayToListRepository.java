package com.example.leetcodeproblems.DataAccesLayer.repository.info;

import com.example.leetcodeproblems.CommonLayer.entity.info.convertstringtoarrtolist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvertArrayToListRepository extends CrudRepository<convertstringtoarrtolist, Integer> {
}
