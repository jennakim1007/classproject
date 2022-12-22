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

    private String todo;

    private String duedate;

    private int finished;

    public Todo toTodoEntity(){
        return Todo.builder().todo(todo).duedate(LocalDate.parse(duedate)).finished(finished).build();
    }


}
