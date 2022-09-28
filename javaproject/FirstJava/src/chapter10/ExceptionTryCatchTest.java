package chapter10;

import java.util.Scanner;

public class ExceptionTryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1번을 입력하세요. >>> ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2번을 입력하세요. >>> ");
		int num2 = sc.nextInt();

		try {
			System.out.println("num1을 num2로 나눈 값 = " + num1 / num2); // <= 예외가 발생할 수 있는 위치

//			String str = null;
//			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 것을 불가합니다. ");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("null!!!");
		} catch (Exception e) {
			// Exception 이 ArithmeticException 아래로 와야 한다.
			// ArithmeticException 이 Exception 을 상속한다.
			// 상위 클래스가 위로 오면 오류 발생
			System.out.println("예외 발생!!!");
			e.printStackTrace();
		} finally { 
			// finally -> 무조건 실행하는 블록, 선택 
			// return 
			
		// try{} finally{} 이런 구조로도 사용이 가능하다.  	
			
		System.out.println("프로그램을 종료합니다. ");
		
		}

	}

}
