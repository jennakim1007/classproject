package com.app.board.repository;

import com.app.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

//                                                    <클래스이름, ID>
public interface BoardRepository extends JpaRepository<Board, Integer> {

    // 리스트 페이지 : findAll()
    // 뷰 페이지 : findById()
    // 수정 : save()
    // 입력 : save()
    // 삭제 : 별도 메소드 생성 -> int, @Transactional

    @Transactional
    @Modifying // insert, update, delete
    /*@Query("delete from Board b where b.bno = ?1")*/
    @Query("delete from Board b where b.bno = :bno")
    int deleteByBno(@Param("bno") Integer bno);

    /*@Transactional
    @Modifying
    @Query("delete from Board b where b.bno = :bno")
    int deleteByBno(Integer bno);

    @Query("select count(b) from Board b where b.photo is not null")
    long countByPhotoNotNull();

    @Query("select b from Board b where b.title like :title")
    List<Board> findByTitleLike(@Param("title") String title);

    @Query("select b from Board b where b.regdate between :regdateStart and :regdateEnd")
    List<Board> findByRegdateBetween(@Param("regdateStart") LocalDate regdateStart, @Param("regdateEnd") LocalDate regdateEnd);*/










}
