package com.example.leetcodeproblems.repository.Web;

import com.example.leetcodeproblems.model.entity.Web.htmlcssinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface htmlcssinfoRep extends CrudRepository<htmlcssinfo, Long> {
}
