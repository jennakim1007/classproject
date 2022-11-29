package com.app.manager.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mc/simple")
@Log4j2
public class SimpleConverterController {

    @GetMapping
    public void form(){
        log.info("form...");
    }

    @PostMapping
    @ResponseBody // String으로 쓰면 문자열로 응답한다는 뜻, 객체로 쓰면 JSON
    public String simple(@RequestBody String body){
        log.info("body >>>>>>> " + body);
        return "body >>>>>>> " + body;
    }




}
