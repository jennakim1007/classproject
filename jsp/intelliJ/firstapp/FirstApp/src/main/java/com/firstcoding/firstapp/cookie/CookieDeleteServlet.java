package com.firstcoding.firstapp.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieDeleteServlet", value = "/cookie/delete")
public class CookieDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("userid", "");
        // 쿠키 삭제 메소드는 없음 -> setMaxAge 소멸시간을 0으로 적용해서 소멸시킴
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/delete.jsp");
        dispatcher.forward(request, response);




    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
