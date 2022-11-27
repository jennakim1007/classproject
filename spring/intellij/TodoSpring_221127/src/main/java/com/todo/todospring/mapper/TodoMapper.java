package com.todo.todospring.mapper;

import com.todo.todospring.domain.TodoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select * from tbl_todo")
    List<TodoDTO> selectAll();

    TodoDTO selectByTno(long tno);

    int insertTodo(TodoDTO todoDTO);

    int updateTodo(TodoDTO todoDTO);

    int deleteTodo(long tno);


}
