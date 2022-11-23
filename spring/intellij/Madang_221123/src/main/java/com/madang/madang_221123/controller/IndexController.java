package com.madang.madang_221123.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String getIndexPage(){
        log.info("IndexController getIndexPage()...");
        return "index";
    }

}
