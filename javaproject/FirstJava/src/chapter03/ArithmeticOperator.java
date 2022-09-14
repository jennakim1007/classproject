package chapter03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 4;
		float num3 = 4.0f; 
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);   // int / int 
		System.out.println(num1 / num3);   // int / float -> float / float = float 
		System.out.println(num1 % num2);
		System.out.println(num1 % num3);
		
		int result = num1 / 0; // 런타임 오류 
			
		
	}
	
	
}
