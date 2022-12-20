package com.app.todo.repository;

import com.app.todo.entity.Todo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    @Query("select t from Todo t where t.tno between :tnoStart and :tnoEnd order by t.tno DESC")
    List<Todo> findByTnoBetween(@Param("tnoStart") Integer tnoStart, @Param("tnoEnd") Integer tnoEnd);

    @Query("select t from Todo t where t.tno between :tnoStart and :tnoEnd order by t.tno DESC")
    List<Todo> findByTnoBetween(@Param("tnoStart") Integer tnoStart, @Param("tnoEnd") Integer tnoEnd, Pageable pageable);








}
