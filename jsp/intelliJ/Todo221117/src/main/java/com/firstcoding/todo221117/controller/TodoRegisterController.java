package com.firstcoding.todo221117.controller;

import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.service.TodoInsertService;
import com.mysql.cj.protocol.Resultset;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Log4j2
@WebServlet(name = "TodoRegisterController", value = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoRegister ... Get");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoRegister ... Post");

        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        TodoDTO todoDTO = TodoDTO.builder().todo(todo).dueDate(dueDate).build();

        try {
            TodoInsertService.getInstance().insertTodo(todoDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("/todo/list");

    }
}
