package chapter04.exam;

public class Exam04 {

	public static void main(String[] args) {
		// 문제 4. 
		// 다음 식을 만족하는 조합을 찾는 프로그램 작성(A와 B값의 조합들을 찾아보자.)
		// A B
		// B A +
		// --------
		// 9 9
		// 10A + B + 10B + A = 99 => 11A + 11B = 99 => 1A + 1B = 9
		// 각각의 자리수 : 0~9
		
		for(int i=0; i<10; i++) {
			System.out.println("A : " + i + " 일 때, B : " + (9-i));
		}
		
	
		
		
		
		
		
	}

}
