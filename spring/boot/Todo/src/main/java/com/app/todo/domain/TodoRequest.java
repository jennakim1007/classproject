package com.app.todo.domain;

import com.app.todo.entity.Todo;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TodoRequest {

    private int tno;

    private String todo;

    private String duedate;

    private Integer finished;

    public Todo toTodoEntity(){
        return Todo.builder().tno(tno).todo(todo).duedate(LocalDate.parse(duedate)).finished(finished).build();
    }


}
