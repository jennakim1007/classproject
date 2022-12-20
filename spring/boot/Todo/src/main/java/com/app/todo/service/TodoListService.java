package com.app.todo.service;

import com.app.todo.domain.TodoPage;
import com.app.todo.entity.Todo;
import com.app.todo.repository.TodoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class TodoListService {

    @Autowired
    private TodoRepository todoRepository;

    // 페이지
    public TodoPage getPage(int pageNum){

        //                                                      페이지 0부터 시작(내가 원하는 값), 페이지 단위(10), tno desc 순으로 정렬
        Page<Todo> page = todoRepository.findAll(PageRequest.of(pageNum-1, 10, Sort.by("tno").descending()));

        // 게시물 리스트
        List<Todo> list = page.getContent();
        log.info("list............" + list);

        // 게시물의 갯수 totalcount
        int totalCount = (int) page.getTotalElements();

        TodoPage todoPage = new TodoPage(10, pageNum, list, totalCount);

        return todoPage;
        
    }

}
