package com.firstcoding.mvc.todo.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TodoDTO {

    private int tno;
    private String todo;
    private String dueDate;
    private boolean finished;

}
