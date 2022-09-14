package chapter03;

public class CharTypeOperator {

	public static void main(String[] args) {
		
		char c1 = 'A';
		
		int codeNum = c1 + 0; // A가 가지는 유니코드 값을 추출 
		// char + int => int + int = int 
		
		System.out.println(codeNum);
		
		// char 타입의 증감 연산은 char 타입을 유지 A 출력
		System.out.println(++c1); // 66 출력 c1 = 66
		System.out.println(c1++); // 66 출력 c1 = 67   출력부터 시킴 
		System.out.println(++c1); // 68 출력 c1 = 68   증가부터 시킴 


		
		
		
		
		
	}

}
