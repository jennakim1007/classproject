package com.app.todo.repository;

import com.app.todo.entity.TodoMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface TodoMemberRepository extends JpaRepository<TodoMember, Integer> {
    @Transactional
    @Modifying
    @Query("delete from TodoMember t where t.userid = :userid")
    int deleteByUserid(String userid);

    Optional<TodoMember> findByUserid(String userid);

    @Query("select count(t) from TodoMember t where t.userid = :userid")
    long countByUserid(@Param("userid") String userid);






}
