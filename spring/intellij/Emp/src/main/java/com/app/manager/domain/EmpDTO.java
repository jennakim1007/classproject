package com.app.manager.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmpDTO {

    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private double sal;
    private double comm;
    private int deptno;

}
