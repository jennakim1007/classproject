package chapter10;

public class BadInputException extends Exception {

	int score;

	public BadInputException(int score) {
		super("입력하신 " + score + "는 국어점수 범위를 벗어납니다. ");
		this.score = score;
	}

	public int getScore() {
		return score;
	}
	
	
	
	
	
}
