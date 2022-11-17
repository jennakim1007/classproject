package com.firstcoding.todo221117.controller;

import com.firstcoding.todo221117.service.TodoDeleteService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Log4j2
@WebServlet(name = "TodoDeleteController", value = "/todo/remove")
public class TodoDeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("DeleteList ... Post");

        String tno = request.getParameter("tno");
        TodoDeleteService.getInstance().deleteTodo(Integer.parseInt(tno));
        response.sendRedirect("/todo/list");

    }
}
