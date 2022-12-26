package com.example.leetcodeproblems.repository.info;


import com.example.leetcodeproblems.model.entity.info.Bytes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BytesRepository extends CrudRepository<Bytes, Integer> {
}
