package com.committee.system.repository;

import com.committee.system.controller.UserController;
import com.committee.system.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends JpaRepository<Member, Long> {
}
