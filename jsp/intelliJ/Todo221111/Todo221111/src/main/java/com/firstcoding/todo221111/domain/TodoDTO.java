package com.firstcoding.todo221111.domain;

public class TodoDTO {

    // 많은 값을 잡도록 int 가 아닌 long으로 선언
    private long tno;
    private String todo;
    private String dueDate;
    // boolean 은 int 0, 1 로 처리하는 방법도 있음
    private boolean finished;

    public TodoDTO(long tno, String todo, String dueDate, boolean finished) {
        this.tno = tno;
        this.todo = todo;
        this.dueDate = dueDate;
        this.finished = finished;
    }

    // 기본생성자 누락하지 않도록 주의
    public TodoDTO() {
    }

    public long getTno() {
        return tno;
    }

    public void setTno(long tno) {
        this.tno = tno;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // boolean에서는 getter을 is로 만든다.
    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", todo='" + todo + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", finished=" + finished +
                '}';
    }






}
