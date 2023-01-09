package com.example.leetcodeproblems.repository.Web;

import com.example.leetcodeproblems.model.entity.Web.soapinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface soapinfoRep extends CrudRepository<soapinfo, Long> {
}
