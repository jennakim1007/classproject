package com.firstcoding.todo221117.domain;

import lombok.*;

import java.time.LocalDate;

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
