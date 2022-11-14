package com.firstcoding.todo221114.controller;

import com.firstcoding.todo221114.domain.TodoDTO;
import lombok.extern.log4j.Log4j2;
import com.firstcoding.todo221114.service.SelectService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TodoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    log.info("TodoList ... doGet()");

    SelectService service = new SelectService();

        List<TodoDTO> list = null;

        try {
            list = service.selectAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("list", list);

    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
    dispatcher.forward(request, response);

    }


}
