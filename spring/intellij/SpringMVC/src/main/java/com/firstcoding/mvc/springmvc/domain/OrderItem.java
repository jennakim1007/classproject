package com.firstcoding.mvc.springmvc.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OrderItem {

    private String itemId;
    private int number;
    private String remark; // 주의사항

}
