package com.example.leetcodeproblems.repository.Web;

import com.example.leetcodeproblems.model.entity.Web.dataformatinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataformatinfoRep extends CrudRepository<dataformatinfo, Long> {
}