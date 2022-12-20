package com.app.todo.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@DynamicInsert
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tno; // auto increase

    @Column
    private String todo;

    @Column
    private LocalDate duedate; // current_timestamp

    @Column
    private Integer finished; // 0(default) || 1

    @ManyToOne
    @JoinColumn(name = "idx")
    private TodoMember idx;


}
