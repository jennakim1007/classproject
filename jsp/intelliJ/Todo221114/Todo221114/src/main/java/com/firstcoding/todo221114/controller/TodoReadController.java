package com.firstcoding.todo221114.controller;

import com.firstcoding.todo221114.domain.TodoDTO;
import com.firstcoding.todo221114.service.SelectByService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoReadController", value = "/todo/read")
@Log4j2
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoReadController...doGet()");

        // request.setCharacterEncoding("utf-8");

        SelectByService selectByService = new SelectByService();

        int tno = 0;
                //Integer.parseInt(request.getParameter("tno"));

        try {
            selectByService.selectByTno(tno);
        } catch (Exception e) {
            // throw new RuntimeException(e);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(request, response);

    }


}
