package ver07.jy;

public class MenuBadInputException extends Exception{
	
	int select;

	public MenuBadInputException(int select) {
		super("1~6 사이의 번호를 입력해주세요. ");
		this.select = select;
	}
	
	public int getSelect() {
		return select;
	}

	
	

}
