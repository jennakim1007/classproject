package chapter03;

public class PostfixOperator {

	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println("num1 = " + num1);
		
		int num2 = num1++;   // 순서 확인(대입 연산 먼저하고 증가 연산이 됨) : num2 = num1 -> num1 = num1 +1
							 // num2 = 5, num1 = 6
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("num1 = " + num1++); // 6으로 나오지만 실제 연산이 끝나면 7이 되겠음.
		
		
		
		

	}

}
