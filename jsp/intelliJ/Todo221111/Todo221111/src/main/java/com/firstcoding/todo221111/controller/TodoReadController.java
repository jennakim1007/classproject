package com.firstcoding.todo221111.controller;

import com.firstcoding.todo221111.domain.TodoDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoReadController", value = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 테스트
        System.out.println("todo read ... doGet()");

        // 사용자 요청 tno 받기 
        String tno = request.getParameter("tno");

        // 테스트
        System.out.println("요청 번호 : " + tno);

        // Service 요청한 tno로 할 일 목록을 검색해서 결과 -> TodoDTO 로 반환
        TodoDTO todo = new TodoDTO(1, "숙제", "2022-11-30", true);
        request.setAttribute("todo", todo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(request, response);

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
