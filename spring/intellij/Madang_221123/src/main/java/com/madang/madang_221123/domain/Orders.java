package com.madang.madang_221123.domain;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Orders {

    private int orderid;
    private int custid;
    private int bookid;
    private int saleprice;
    private LocalDate orderdate;

}
