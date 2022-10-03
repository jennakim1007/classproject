package chapter10.exam.jy;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BadInputExceptionMain {
	
	// 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램 
	// Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다
	// 이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name = null;
		int birthYear = 0;
		
		System.out.println("이름을 입력하세요.");
		
		try {
			name = sc.nextLine();
			if(!(Pattern.matches("^[a-z0-9A-Z]*$", name))) {
				throw new BadInputException();
			}
			System.out.println("이름 : " + name);
		} catch(BadInputException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("태어난 년도를 입력하세요. ");

		try {
			birthYear = sc.nextInt();
			System.out.println("태어난 년도 : " + birthYear);
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요. ");
		}
		
	}

	// 숫자만 받을 경우 -> ^[0-9]*$
	// 영문자만 받을 경우 -> ^[a-zA-z]*$ 
	// 한글만 받을 경우 -> ^[가-힣]*$ 
	// 영어+숫자 -> ^[a-z0-9A-Z]*$
	
	// 이메일 패턴: ^[a-z0-9A-Z]+@[a-z0-9A-Z]\.[a-zA-Z]+$   => xxx@naver.com
	// 폰번호 패턴: ^\d{3}-\d{4}-\d{4}
	
	// ? : 앞의 문자가 하나이거나 없거나 
	// | : or
	// . : 임의의 하나의 문자 
	// \. : dot (역슬래쉬 없으면 인식이 안된다)
	// \w : 알파벳 + 숫자 
	// \d : [0-9]
	// \d{} : 중괄호안에 범위를 쓸 수 있다
	// ^ : 시작 
	// [-], [] : 범위 
	// $ : 종료 
	// * : 있을수도 있고 없을수도 있다 
	// + : 하나 이상의 문자가 반드시 있어야 한다 
	
}
