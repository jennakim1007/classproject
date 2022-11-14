package com.firstcoding.firstapp.dept;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeptListController", value = "/dept/list")
@Log4j2
public class DeptListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("DeptList...doGet()...");

        DeptService service = new DeptService();

        // System.out.println("DeptList...doGet()...");

        List<Dept> list = null;

        try {
            list = service.getList();
        } catch (Exception e) {
            // throw new RuntimeException(e);
        }

        // view  페이지로 결과 데이터 전달(공유)
        request.setAttribute("list",list);

        // view 페이지 지정
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/dept/list.jsp");
        dispatcher.forward(request, response);


    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
