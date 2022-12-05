package com.example.leetcodeproblems.DataAccesLayer.repository;


import com.example.leetcodeproblems.CommonLayer.entity.Bytes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BytesRepository extends CrudRepository<Bytes, Integer> {
}
