package com.todo.todospring.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("AuthCheckIntereptor 로그인 여부 체크...");

        HttpSession session = request.getSession(false);
        // LoginController 에서 session.setAttribute("loginInfo", dto.toLoginInfo()) 처리하였음
        if(session!=null && session.getAttribute("loginInfo")!=null){
            log.info("AuthCheckIntereptor 로그인 상태 ...");
            return true;
        }

        log.info("AuthCheckIntereptor ql로그인 상태 ...");
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
