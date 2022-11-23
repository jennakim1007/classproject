package com.firstcoding.mvc.springmvc.domain;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserRequest {

    private LocalDate date;

//    public void setDate(String date){
//        this.date= LocalDate.parse(date);
//    }

}
