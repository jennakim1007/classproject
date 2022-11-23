package com.firstcoding.mvc.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@Controller
public class SampleController {

    // ModelAndView 사용
    @RequestMapping("/sample")
    public ModelAndView getSamplePage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample"); // => /WEB-INF/views/sample.jsp
        return mav;
    }

    // String 사용
    @RequestMapping("/sample2") // 경로는 소문자로 기재한다!
    public String getStringPage(){
        return "sample2"; // => /WEB-INF/views/sample2.jsp
    }

    // void 사용 -> view 페이지만 있으면 이런식으로 많이 사용함
    @RequestMapping("/sample3")
    public void getVoidPage(){
    }

    @RequestMapping("/sample4")
    @ResponseBody // 응답 : jsp 가 아닌 메소드 선언 타입으로 응답 처리 됨
    public String page(){
        return "Y";
    }

    @RequestMapping("/sample5")
    @ResponseBody
    public String page2(int num){
        String str = null;
        str.trim();
        return String.valueOf(num);
    }




}
