package com.app.todo.repository;

import com.app.todo.entity.Todo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    @Query("select t from Todo t where t.tno between :tnoStart and :tnoEnd order by t.tno DESC")
    List<Todo> findByTnoBetween(@Param("tnoStart") Integer tnoStart, @Param("tnoEnd") Integer tnoEnd);

    @Transactional
    @Modifying
    @Query("update Todo t set t.todo = :todo, t.duedate = :duedate, t.finished = :finished where t.tno = :tno")
    int updateTodoByTno(@Param("todo") String todo, @Param("duedate") LocalDate duedate, @Param("finished") Integer finished, @Param("tno") Integer tno);

    @Transactional
    @Modifying
    @Query("delete from Todo t where t.tno = :tno")
    int deleteByTno(Integer tno);






}
