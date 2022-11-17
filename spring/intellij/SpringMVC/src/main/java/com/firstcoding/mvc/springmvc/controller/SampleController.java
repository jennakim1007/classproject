package com.firstcoding.mvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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


}
