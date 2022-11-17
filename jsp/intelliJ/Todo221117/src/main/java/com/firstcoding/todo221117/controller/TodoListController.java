package com.firstcoding.todo221117.controller;

import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.service.TodoListService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@Log4j2
@WebServlet(name = "TodoListController", value = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("TodoList ... Get");

        List<TodoDTO> list = null;
        try {
            list = TodoListService.getInstance().getTodoList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("list", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
