package com.todo.todospring.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class TodoDaoOld {

    public void selectAll(){

        log.info("TodoDao.selectAll() 실행 되었습니다.");

    }

}
