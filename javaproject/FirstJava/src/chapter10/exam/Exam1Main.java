package chapter10.exam;

import java.util.regex.Pattern;

public class Exam1Main {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 콘솔에서 사용자 아이디를 입력 받아 
		 * 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
			ㄴ 'a'<= c <='z' || 'A'<= c <='Z' || '0'<= c <='9'
			① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
			② 예외 클래스 이름은 BadIdInputException이라고 정의합시다
		 */
		
		String str = "abcdef12U!";
		
		//영문자와 숫자의 조합으로 된 패턴
		boolean chk1 = Pattern.matches("^[a-z0-9A-Z]*$", str); // 
		System.out.println(chk1);		
		
		try {
			if(!chk1) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("소문자, 대문자, 숫자 입력만 가능합니다. ");
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

	
	
	
}
