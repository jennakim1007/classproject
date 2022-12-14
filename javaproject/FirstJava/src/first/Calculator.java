package first;

public class Calculator {
	
	public static void main(String[] args) 
	{
		// TODO Calculator 클래스를 정의해 봅시다.
		/*
		① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
		② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
		③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
		④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
		*/

		System.out.println("10+20=" + add(10,20)); // 예상값 : 10+20=30
		System.out.println(substract(5,1));
		System.out.println("100-10=" + substract(100,10)); // 예상값 : 100-10=90
		System.out.println("100*100=" + multifly(100,100)); // 예상값 : 100*100=10000
		System.out.println("10/3=" + divide(10,3)); // double num1 = 10;(int->double로 자동으로 형변환 한다.) 
		System.out.println("10/2=" + divide(10,2));
		System.out.println(divide(10.5,2.1));
		
	}
	
	// ① 숫자 두 개를 매개변수의 인자로 전달받아     더하기      메소드를 추가합시다.
	public static long add(long num1, long num2) {
		//long result = num1 + num2;
		//return result; 
		return num1+num2; // 성능이 좋아지고 보기 쉽도록 코드를 조정하는 것 = 리팩토링(refactoring)
	}
	
	// ② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	public static long substract(long num1, long num2) {
		return num1-num2;
		
	}
	
	// ③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	public static long multifly(long num1, long num2) {
		return num1*num2;
		
	}
	
	// ④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다. (나누기는 실수 사용)
	public static double divide(double num1, double num2) {
		return num1 / num2;
		
		
	}
	
}
	
	

