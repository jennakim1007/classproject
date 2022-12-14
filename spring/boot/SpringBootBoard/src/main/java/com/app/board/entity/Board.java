package com.app.board.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_board")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Board {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bno;

    @Column
    private String title;

    @Column
    private String content;

    /*@Column(updatable = false)
    private String writer;*/

    @ManyToOne
    @JoinColumn(name = "writer")
    private BoardMember writer; // 여러 개 board 에서 1개의 member를 갖는다.

    @Column
    private String photo;

    @Column(insertable = false, updatable = false)
    private LocalDate regdate;

    @Column(insertable = false)
    private LocalDate updatedate;

}
