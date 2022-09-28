package chapter10;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {

		// 명시적인 예외 발생!!!
		// throw new Exception("강제적 예외 발생");

		// 국어점수 입력받기 : 국어점수의 범위는 0~100

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("국어점수를 입력하세요. >> ");
	
			int score = sc.nextInt();
	
			try {
				if (!(score >= 0 && score <= 100)) {
					// throw new Exception("입력한 점수는 정상범위가 아닙니다. ");
					throw new BadInputException(score);
				}
				System.out.println("국어점수는 " + score + "점 입니다. ");
				break;
				
			} catch (BadInputException e) {
				System.out.println(e.getMessage()); 
				System.out.println("국어점수를 다시 입력하세요. ");
				// System.out.println(e.getScore());
			}
		}

	}
	

}
