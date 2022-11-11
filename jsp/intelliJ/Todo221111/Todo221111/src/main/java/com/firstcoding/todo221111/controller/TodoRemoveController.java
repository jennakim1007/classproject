package com.firstcoding.todo221111.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRemoveController", value = "/todo/remove")
public class TodoRemoveController extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 테스트
        System.out.println("todo remove ... doPost()");

        // 삭제하고자 하는 todo 의 tno 값을 받는다.
        String tno = request.getParameter("tno");
        System.out.println("삭제할 todo 번호 : " + tno);

        // Service 로 tno 전달 -> Dao 해당 로우 삭제

        response.sendRedirect("/todo/list");




    }
}
