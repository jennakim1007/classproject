package com.firstcoding.todo221114.domain;

import lombok.*;
import lombok.extern.log4j.Log4j2;

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

//    public TodoDTO(int tno, String todo, String dueDate, boolean finished) {
//        this.tno = tno;
//        this.todo = todo;
//        this.dueDate = dueDate;
//        this.finished = finished;
//    }

}



