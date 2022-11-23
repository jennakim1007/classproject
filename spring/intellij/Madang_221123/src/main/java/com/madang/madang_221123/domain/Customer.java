package com.madang.madang_221123.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Customer {

    private int custid;
    private String name;
    private String address;
    private String phone;

}
