package com.app.manager.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

}
