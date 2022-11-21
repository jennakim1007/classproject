package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.Report;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Log4j2
@Controller
@RequestMapping("/report")
public class FileUploadController {

    @GetMapping
    public String getReportForm(){

        return "/report/reportForm";
    }

    // 아래 3가지 방법으로 파일을 받아본다.

    //방법 1.  @RequestParam
    @PostMapping("/submit1")
    public String result1(
            @RequestParam("snum") String snum,
            @RequestParam("sname") String sname,
            @RequestParam("report") MultipartFile report,
            HttpServletRequest request,
            Model model) throws IOException {

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);
        log.info("파일 : " + report.getOriginalFilename());

        // web 경로
        String uploadURI = "/uploadfile/report"; // http://localhost:8080/uploadfile/report
        // 시스템 경로
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info("dirRealPath : " + dirRealPath);

        // 저장
        // report.transferTo(new File(폴더, "파일이름"));
        report.transferTo(new File(dirRealPath, report.getOriginalFilename()));

        model.addAttribute("snum", snum);
        model.addAttribute("sname", sname);
        model.addAttribute("fileName", report.getOriginalFilename()); // 파일이름

        return "report/submit1";
    }

    //방법 2.  HtpServletRequest -> MultiPartHtpServletRequest
    @PostMapping("/submit2")
    public String result2(
            MultipartHttpServletRequest request,
            Model model
    ) throws IOException {

        String snum = request.getParameter("snum");
        String sname = request.getParameter("sname");
        MultipartFile report = request.getFile("report"); // MultipartFile 알기

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);
        log.info("파일 : " + report.getOriginalFilename());

        String uploadURI = "/uploadfile/report"; // http://localhost:8080/uploadfile/report
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info("dirRealPath : " + dirRealPath);

        report.transferTo(new File(dirRealPath, report.getOriginalFilename()));

        model.addAttribute("snum", snum);
        model.addAttribute("sname", sname);
        model.addAttribute("fileName", report.getOriginalFilename());

        return "report/submit2";
    }

    //방법 3. 커맨드 객체
    @PostMapping("/submit3")
    public String result3(
            Report report,
            HttpServletRequest request,
            Model model
    ) throws IOException {

        log.info("학번 : " + report.getSnum());
        log.info("이름 : " + report.getSname());
        log.info("파일 : " + report.getReport().getOriginalFilename());

        String uploadURI = "/uploadfile/report"; // http://localhost:8080/uploadfile/report
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info("dirRealPath : " + dirRealPath);

        report.getReport().transferTo(new File(dirRealPath, report.getReport().getOriginalFilename()));

        model.addAttribute("snum", report.getSnum());
        model.addAttribute("sname", report.getSnum());
        model.addAttribute("fileName", report.getReport().getOriginalFilename());

        return "report/submit3";
    }



}
