package chapter03;

public class RelationalOperator {

	public static void main(String[] args) 
	{
		// 관계연산자 ( 비교연산자 )
		// > <     -> 크다 작다(같은 경우 false 반환) 
		// >= <=   -> 크거나같다 작거나같다 
		// ==      -> 연산자가 같으면 true 반환 
		// !=      -> 연산자가 다르면 true 반환
		
		int num1 = 30;
		int num2 = 2;
		
		System.out.println(num1 > num2);  // Console : true      
		System.out.println(num1 < num2);  // false 
		System.out.println(num1 >= num2); // true
		System.out.println(num1 <= num2); // false
		System.out.println(num1 == num2); // false 
		System.out.println(num1 != num2); // true   
		
		if(num1 > num2) {
			// 참일 때 처리되는 블록
			System.out.println("num1이 num2보다 큽니다.");
			// false 일 경우 아무처리 없음 
		}

		
		
		
		
		
		
		
		
	}

}
