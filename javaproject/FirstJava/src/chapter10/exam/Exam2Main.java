package chapter10.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2Main {

	public static void main(String[] args) {

		/*
		Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
		이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num=0; // 변수 선언해서 try 블럭 안에서도 밖에서도 num 을 쓸 수 있도록 한다. 
		
		System.out.print("숫자를 입력하세요. >>> "); // 0123456789
		try {
			num = sc.nextInt(); // <= 예외처리 포인트 
			System.out.println("num = " + num);

		} catch(InputMismatchException e) {
			System.out.println("예외발생 ");
			System.out.println("정상적인 숫자를 입력해주세요. ");
		}
		
		
	}

}
