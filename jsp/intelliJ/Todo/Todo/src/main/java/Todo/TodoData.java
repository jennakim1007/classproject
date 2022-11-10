package Todo;

public class TodoData {

    private int num;
    private String title;
    private String date;

    public TodoData(int num, String title, String date) {
        this.num = num;
        this.title = title;
        this.date = date;
    }

    public TodoData(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public TodoData() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TodoData{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
