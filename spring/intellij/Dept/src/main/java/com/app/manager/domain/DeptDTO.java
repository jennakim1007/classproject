package com.app.manager.domain;

import lombok.*;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class DeptDTO {

    @Min(value = 1)
    @Max(value = 99)
    @Positive // 양수값만 받는다. (<-> Negative : 음수)
    // 매핑이 될 수 있도록, 변수 이름을 컬럼의 이름과 일치시켜야함!
    private int deptno;

    @NotEmpty // 문자열은 비어있지 않은 상태, List -> 요소의 개수가 비어있는지
    private String dname;

    @NotEmpty
    private String loc;

}

    // @Future : 현재 시간보다 미래이어야 한다. ex. TodoList 기간이 미래 시간이어야 한다.
    // @Email : 이메일 체크 -> @만 체크해준다.
    // @NotBlank : 공백 문자열(" ")도 체크(empty보다 타이트하다.)
    // @NotNull : Null이 아니여야함