package com.app.board.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface BoardRepository extends JpaRepository<BoardDTO, Integer> {

    @Transactional
    @Modifying
    @Query("delete from BoardDTO b where b.bno = :bno")
    int deleteByBno(Integer bno);

    @Query("select count(b) from BoardDTO b where b.photo is not null")
    long countByPhotoNotNull();

    @Query("select b from BoardDTO b where b.title like :title")
    List<BoardDTO> findByTitleLike(@Param("title") String title);

    @Query("select b from BoardDTO b where b.regdate between :regdateStart and :regdateEnd")
    List<BoardDTO> findByRegdateBetween(@Param("regdateStart") LocalDate regdateStart, @Param("regdateEnd") LocalDate regdateEnd);













}
