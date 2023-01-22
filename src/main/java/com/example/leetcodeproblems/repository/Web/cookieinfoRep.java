package com.example.leetcodeproblems.repository.Web;

import com.example.leetcodeproblems.model.entity.Web.cookieinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cookieinfoRep extends CrudRepository<cookieinfo, Long> {
}
