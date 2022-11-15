package com.firstcoding.firstapp.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieSearchServlet", value = "/cookie/search")
public class CookieSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieName = request.getParameter("cname");

        Cookie[] cookies = request.getCookies();
        String value = "";
        for(int i=0; i<cookies.length; i++){
            Cookie c = cookies[i];
            if(cookieName.equals(c.getName())){
                value = c.getValue();
                break;
            }
        }

        request.setAttribute("result", value);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/search.jsp");
        dispatcher.forward(request, response);




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
