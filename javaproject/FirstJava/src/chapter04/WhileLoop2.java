package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		// 반복문 while 
		
		// 반복체크할 변수 
		/* while(반복의 조건 : 변수 체크) {
		 * 반복해야할 코드 
		 * 변수 증감 연산식
		 */
	
		// 5번 "JAVA" 를 출력하는 코드 작성 
		// 5번 출력문을 실행
			
		int count = 0;
		while(count++<5) {
			System.out.println("JAVA");
			
			// 반복문을 탈출할 수 있는 증감식
			// count = count + 3;
			// count += 1;
			// count++;
			// ++count;
		}
		
		
	}

}
