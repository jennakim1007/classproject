package com.app.todo.controller.auth;

import com.app.todo.domain.MemberRequest;
import com.app.todo.security.CustomUserDetailService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
@RequestMapping("/auth/register")
public class MemberInsertController {

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @GetMapping
    public void getRegisterForm(){

    }

    @PostMapping
    public String insertMember(MemberRequest memberRequest){

        log.info("memberRequest......" + memberRequest);
        customUserDetailService.save(memberRequest);

        return "redirect:/auth/login";

    }

    @PostMapping("/idCheck")
    @ResponseBody
    public long idCheck(@RequestParam("userid") String userid){
        log.info("idCheck Controller.........");
        long cnt = customUserDetailService.idCheck(userid);
        log.info("cnt........."+cnt);
        return cnt;
    }

}
