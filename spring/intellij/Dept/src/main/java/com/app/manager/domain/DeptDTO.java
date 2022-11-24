package com.app.manager.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class DeptDTO {

    // 매핑이 될 수 있도록, 변수 이름을 컬럼의 이름과 일치시켜야함!
    private int deptno;
    private String dname;
    private String loc;

}
