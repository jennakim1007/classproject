package com.firstcoding.todo221117.controller;

import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.service.TodoModifyService;
import com.firstcoding.todo221117.service.TodoSelectService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Log4j2
@WebServlet(name = "TodoModifyController", value = "/todo/modify")
public class TodoModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoModify ... Get");

        String tno = request.getParameter("tno");
        request.setAttribute("todo", TodoSelectService.getInstance().selectTodo(Integer.parseInt(tno)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoModify ... Get");

        int tno = Integer.parseInt(request.getParameter("tno"));
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        Boolean finished = Boolean.valueOf(request.getParameter("finished"));

        TodoDTO todoDTO = TodoDTO.builder().tno(tno).todo(todo).dueDate(dueDate).finished(finished).build();
        TodoModifyService.getInstance().modifyTodo(todoDTO);

        response.sendRedirect("/todo/list");

    }
}
