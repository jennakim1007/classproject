package com.app.todo.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todomember")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@DynamicInsert
public class TodoMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx; // auto increase

    @Column
    private String userid;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String role; // USER(default) || ADMIN

    @Column
    private LocalDate regdate; // current_timestamp

}
