package com.app.todo.domain;

import com.app.todo.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoPage {

    private int countPerPage; // 페이지 당 출력할 게시물 개수

    private int pageNum; // 현재 페이지 번호

    private List<Todo> list; // todo list

    private int totlaCount; // 전체 게시물 개수

    private int startNum; // 페이지 시작 번호

    private int endNum; // 페이지 끝 번호

    private boolean prev; // 이전 버튼

    private boolean next; // 다음 버튼

    public TodoPage(int countPerPage, int pageNum, List<Todo> list, int totlaCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totlaCount = totlaCount;
        calTodoPage();
    }

    public void calTodoPage(){

        // 끝번호 ex.
        // 1 -> 1.0 / 10 => 0.1 => ceil : 가장 가까운 높은 정수값을 반환 1 * 10
        // 11 -> 11.0 / 10 => 1.1 => ceil : 가장 가까운 높은 정수값을 반환 2 * 10...
        this.endNum = (int)(Math.ceil((this.pageNum*1.0) / 10)) * 10;

        // 시작 번호
        this.startNum = this.endNum - this.countPerPage -1;

        // 전체 페이지의 끝 번호
        int realEndNum = (int)(Math.ceil((this.totlaCount*1.0) / countPerPage ));

        // 실제 끝번호 : 구간의 마지막 번호보다 실제 끝번호가 작은 경우 endNum은 realEndNum 이 된다.
        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

        // 이전 이동 가능 여부
        this.prev = this.startNum>1;

        // 다음 이동 가능 여부
        this.next = this.endNum<realEndNum;

    }





}
