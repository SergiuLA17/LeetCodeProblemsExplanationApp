package com.example.leetcodeproblems.repository.Web;

import com.example.leetcodeproblems.model.entity.Web.httpinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface httpinfoRep extends CrudRepository<httpinfo, Long> {
}
