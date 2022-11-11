package com.firstcoding.todo221111.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRegisterController", value = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자가 입력할 수 있는 폼 화면

        // 테스트
        System.out.println("todo register ... doGet()");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자가 입력한 데이터를 받아서 처리

        // 테스트
        System.out.println("todo register ... doPost()");

        // 한글 처리 : post
        request.setCharacterEncoding("utf-8");

        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        // 테스트
        System.out.println(todo);
        System.out.println(dueDate);

        response.sendRedirect("/todo/list");

    }
}
