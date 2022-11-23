package com.madang.madang_221123.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Book {

    private int bookid;
    private String bookname;
    private String publisher;
    private int price;

}
