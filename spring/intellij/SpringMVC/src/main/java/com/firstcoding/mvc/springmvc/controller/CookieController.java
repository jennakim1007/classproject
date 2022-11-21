package com.firstcoding.mvc.springmvc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Log4j2
@Controller
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping("/make")
    public String makeCookie(HttpServletResponse response){

        Cookie cookie = new Cookie("userName", "son");
        cookie.setPath("/");
        cookie.setMaxAge(60*60);

        response.addCookie(cookie);

        return "/cookie/make";
    }

    @GetMapping("/view")
    public String viewCookie(
            @CookieValue("userName") String userName,
            @CookieValue(name = "auth", defaultValue = "ok") String auth,
            Model model,
            @RequestHeader("Referer") String referer)
    {
        log.info("userName = " + userName);
        log.info("auth = " + auth);
        log.info("referer = " + referer);
        model.addAttribute("cookieName", "userName");
        model.addAttribute("cookieValue", userName);

        return "/cookie/view";
    }




}
