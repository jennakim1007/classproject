package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.LoginRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/login") // 경로 매핑(기본 경로)
@Log4j2
public class LoginController {

    // @RequestMapping(method = RequestMethod.GET) // 메소드 매핑 -> Servlet doGet()과 동일
    @GetMapping // => http://localhost:8080/login
    public String getLoginForm(Model model){
        model.addAttribute("msg", "아이디와 패스워드를 반드시 입력하세요.");
        return "login/form"; // => /WEB-INF/views/login/form.jsp
    }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String login(String uid, String pw, String p,
                        //@RequestParam(value = "p", required = true) String page)
                        @RequestParam(value = "p", defaultValue = "1") int page,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        @ModelAttribute("req") LoginRequest loginRequest,
                        @RequestParam Map paramMap
                        ){

        String uId2 = request.getParameter("uid");
        String pw2 = request.getParameter("pw");

        log.info("uid = " + uid);
        log.info("pw = " + pw);
        log.info("p = " + p);
        log.info("p(page) = " + page);
        log.info("uId2 = " + uId2);
        log.info("pw2 = " + pw2);
        log.info("loginRequest = " + loginRequest);
        log.info("paramMap = " + paramMap);

        request.getSession().setAttribute("loginInfo", uid);

        // return "login/login"; // "redirect:/index"
        return "redirect:mypage/mypage1";

    }

    @GetMapping("/info") // 경로 매핑(추가 경로) => http://localhost:8080/login/info
    public String info(){
        return "login/info";
    }




}
