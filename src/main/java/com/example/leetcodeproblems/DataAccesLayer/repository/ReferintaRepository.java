package com.example.leetcodeproblems.DataAccesLayer.repository;

import com.example.leetcodeproblems.CommonLayer.entity.Autoboxing;
import com.example.leetcodeproblems.CommonLayer.entity.Referinta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferintaRepository extends CrudRepository<Referinta, Integer> {
}
