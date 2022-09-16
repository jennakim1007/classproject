package chapter04;

public class ForLoopTest {

	public static void main(String[] args) {
		
		// "JAVA" 출력을 5번 해보자. 
		/* 
		 * for(초기식 ; 반복의 조건식 ; 증감식) {
		 * 		반복할 문장들..
		 * }
		 */
			
		for(int i=0; i<5; i++) {
			System.out.println("JAVA " +i);
		}
		
		// 1~10 까지의 숫자 중 짝수만 출력
		for(int i=2; i<=10; i+=2) {
			System.out.println("짝수 " +i);
		}

	}

}
