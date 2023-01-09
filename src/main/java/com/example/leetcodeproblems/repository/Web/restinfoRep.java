package com.example.leetcodeproblems.repository.Web;

import com.example.leetcodeproblems.model.entity.Web.restinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restinfoRep extends CrudRepository<restinfo, Long> {
}
