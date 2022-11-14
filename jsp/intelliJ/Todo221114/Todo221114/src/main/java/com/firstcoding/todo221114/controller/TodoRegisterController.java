package com.firstcoding.todo221114.controller;

import com.firstcoding.todo221114.domain.TodoDTO;
import com.firstcoding.todo221114.service.InsertService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRegisterController", value = "/todo/register")
@Log4j2
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoRegister ... doGet()");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoRegister ... doPost()");

        request.setCharacterEncoding("utf-8");

        int tno = 0;
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        boolean finished = false;

        InsertService service = new InsertService();
        try {
            service.insert(new TodoDTO(tno, todo, dueDate, finished));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            response.sendRedirect("/todo/list");

        }

    }
}
