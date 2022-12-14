package com.app.board.mapper;

import com.app.board.domain.BoardArticleDTO;
import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardWriteRequest;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("select * from tbl_board")
    List<BoardDTO> selectAll();

    @Select("select *, (select count(*) from tbl_reply r where r.bno=b.bno) as replycnt from tbl_board b order by b.bno desc limit #{start}, #{count}")
    List<BoardArticleDTO> selectList(@Param("start") int start, @Param("count") int count);
    /*
    @Select("select * from tbl_board order by bno desc limit #{start}, #{count}")
    List<BoardDTO> selectList(@Param("start") int start, @Param("count") int count);
    */

    @Select("select count(*) from tbl_board")
    Integer totalCount(); // 전체 게시물 개수 구하기

    // 게시글 하나의 정보 읽기
    @Select("select * from tbl_board where bno=#{bno}")
    BoardDTO selectByBno(int bno);

    @Insert("INSERT INTO tbl_board(title,content,writer,photo)VALUES(#{title}, #{content}, #{writer},#{photo})")
    Integer insert(BoardDTO boardDTO) throws SQLException;

    @Delete("delete from tbl_board where bno=#{bno}")
    Integer deleteByBno(int bno);

    @Update("update tbl_board set title=#{title}, content=#{content}, writer=#{writer}, photo=#{photo}, updatedate=now() where bno=#{bno}")
    Integer update(BoardDTO boardDTO) throws SQLException;

}
