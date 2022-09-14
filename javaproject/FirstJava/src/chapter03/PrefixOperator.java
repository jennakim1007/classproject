package chapter03;

public class PrefixOperator {

	public static void main(String[] args) {
		
		int num1 = 5;
		
		System.out.println("num1 : " + num1);
		
		int num2 = ++num1;  // 순서 확인(먼저 증가시키고 대입 연산이 일어난다) num1 = num1 + 1 -> num2 = num1;
						
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("num1 : " + ++num1);
		
	

	}

}
