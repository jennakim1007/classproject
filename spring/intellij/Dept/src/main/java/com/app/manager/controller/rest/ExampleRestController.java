package com.app.manager.controller.rest;

import com.app.manager.domain.DeptDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
@Log4j2
public class ExampleRestController {

    // 1. 메소드의 반환 타입이 String인 경우 -> 문자열 응답
    @GetMapping("/sample1")
    public String sayHello(){
        return "Hello~!^^* （＾∀＾●）ﾉｼ❤";
    }

    // 2. 메소드의 반환 타입이 객체인 경우 -> JSON 형식으로 응답
    @GetMapping("/sample2")
    public DeptDTO getDept(){
        DeptDTO deptDTO = DeptDTO.builder().deptno(90).dname("DEV").loc("SEOUL").build();
        return deptDTO;
    }

    // 3. 메소드의 반환 타입이 List인 경우
    @GetMapping("/sample3")
    public List<DeptDTO> getDeptList(){
        List<DeptDTO> list = new ArrayList<>();
        list.add(new DeptDTO(10, "test10", "loc10"));
        list.add(new DeptDTO(20, "test20", "loc20"));
        list.add(new DeptDTO(30, "test30", "loc30"));
        list.add(new DeptDTO(40, "test40", "loc40"));
        return list;
    }

    // 34 메소드의 반환 타입이 Map인 경우
    @GetMapping("/sample4")
    public Map<Integer, DeptDTO> getDeptMap(){
        Map<Integer, DeptDTO> map = new HashMap<>();
        map.put(10, new DeptDTO(10, "test10", "loc10"));
        map.put(20, new DeptDTO(20, "test20", "loc20"));
        map.put(30, new DeptDTO(30, "test30", "loc30"));
        map.put(40, new DeptDTO(40, "test40", "loc40"));
        map.put(50, new DeptDTO(50, "test50", "loc50"));
        return map;
    }



}
