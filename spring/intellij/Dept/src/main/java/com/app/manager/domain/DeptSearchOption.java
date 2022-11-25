package com.app.manager.domain;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Service
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeptSearchOption {

    private String searchType; // 부서이름 or 위치
    private String keyword;

}
