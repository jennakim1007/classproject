package chapter10.exam.jy;

public class BadInputException extends Exception{

	// 예외 클래스 이름은 BadIdInputException이라고 정의합시다
	// 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다
	// 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램 
	
	/* 예외 클래스 정의하는 방법
	 * 
	 * Class 새로운 클래스이름 extends Exception { 
	 *  	// 생성자
	 *  	새로운 클래스이름(){
	 *  			super("오류메세지");
	 * 	 }
	 *  }
	 */

	public BadInputException() {
		super("영문자와 숫자만 입력 가능합니다. ");
	}
	
}

	

