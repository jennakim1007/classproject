package com.app.board.domain;

import com.app.board.entity.Board;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    // 페이지 당 출력할 게시물의 개수
    private int countPerPage;

    // 현재 페이지 번호
    private int pageNum;

    // 게시물의 리스트
    // private List<BoardArticleDTO> list;
    private List<Board> list;

    // 전체 게시물의 개수
    private int totalCount;

    // 페이징의 시작 번호
    private int startNum;

    // 페이징의 끝 번호
    private int endNum;

    // 이전 버튼 출력 여부
    private boolean prev;

    // 다음 버튼 출력 여부
    private boolean next;

    public BoardListPage(int countPerPage, int pageNum, List<Board> list, int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();
    }

    private void calPageInfo() {

        // endpage 끝번호 1 2 3...10 / 11 12 13... 20 / 21 22 23.. 30
        // this.endNum = (int)(Math.ceil((this.pageNum*1.0) / this.countPerPage))*10;
        this.endNum = (int)(Math.ceil((this.pageNum*1.0) / 10))*10;
        // 1 -> 1.0 / 10 => 0.1 => ceil : 가장 가까운 높은 정수값을 반환 1 * 10
        // 11 -> 11.0 / 10 => 1.1 => ceil : 가장 가까운 높은 정수값을 반환 2 * 10

        // 시작번호
        this.startNum = this.endNum-9;

        // 전체 페이지의 끝번호
        int realEndNum = (int)(Math.ceil((this.totalCount * 1.0) / countPerPage));

        // 실제 마지막값 : 구간의 마지막 번호보다 실제 페이지 끝번호가 작으면 endnum 은 realendnum 이 되어야 한다.
        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

        // 이전 구간으로 이동 가능한지
        this.prev = this.startNum>1;

        // 다음 구간으로 이동 가능한지(마지막 번호인지)
        this.next = this.endNum<realEndNum;

    }

}
