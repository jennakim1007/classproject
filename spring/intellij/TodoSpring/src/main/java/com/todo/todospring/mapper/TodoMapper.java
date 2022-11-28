package com.todo.todospring.mapper;

import com.todo.todospring.domain.TodoDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select * from tbl_todo")
    List<TodoDTO> selectAll();

    @Select("select * from tbl_todo where tno=#{tno}")
    TodoDTO selectByTno(long tno);

    int insertToDo(TodoDTO dto);

    int updateTodo(TodoDTO dto);

    @Delete("delete from tbl_todo where tno=#{tno}")
    int deleteTodo(long dto);


}
