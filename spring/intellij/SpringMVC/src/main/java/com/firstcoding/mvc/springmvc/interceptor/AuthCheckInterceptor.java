package com.firstcoding.mvc.springmvc.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info(" >>>>>>> 회원 로그인 여부 체크 interceptor...");

        // 회원 로그인 상태 체크
        HttpSession session = request.getSession(false);
        // .getSession(), .getSession(true) =>  will return a current session. if current session does not exist, then it will create a new one.
        // getSession(false) => will return current session if current session exists. will return null if no session found. NOT create a new session.

        // 회원이 로그인 상태이다?
        if(session!=null && session.getAttribute("loginInfo")!=null){
            // 로그인 상태이다!
            log.info(" >>>>>>> 로그인 상태");
            return true;
        }

        log.info(" >>>>>>> 비로그인 상태");
        response.sendRedirect("/login");

        return false;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
