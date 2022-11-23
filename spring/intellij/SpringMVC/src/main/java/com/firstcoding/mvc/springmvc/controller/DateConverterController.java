package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.time.LocalDate;

@Controller
@RequestMapping("/date")
@Log4j2
public class DateConverterController {

    // @GetMapping -> 4 버전이후부터 사용 가능
    @RequestMapping(method = RequestMethod.GET)// 하위 버전일때는 이 처럼 method 사용함
    public String getDateForm(){
        return "dateForm";
    }

    @PostMapping
    public String Date(
            LocalDate date
            , UserRequest userRequest
            , Model model){
        model.addAttribute("date", date);
        return "date";
    }



}
