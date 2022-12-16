package com.app.springsercurity.repository;

import com.app.springsercurity.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {



}
