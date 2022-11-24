package com.app.manager.service;

import com.app.manager.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EmpDeleteService {

    @Autowired
    private EmpMapper empMapper;

    public int delete(int empno){
       return empMapper.deleteEmpByEmpno(empno);
    }


}
