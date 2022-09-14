package chapter03;

public class CastingOperator {

	public static void main(String[] args) {
		
		//
		byte num1 = 10;
		byte num2 = 20;
		
		// 기본형 / 참조형
		// 기본형 : 숫자(정수 : byte, short, int, long, 실수 : float, double), 문자(char), 논리값(boolean) 
		
		
		byte result = (byte)(num1 + num2);
	
		// byte result = num1 + num2; -> byte 가 int 로 자동 변환되어 오류가 뜬다.  
		// ㄴ byte + byte => int + int = int
		// ㄴ 해결책 : int 결과로 볼 수 있도록 result 수정 혹은 num을 byte 로 축소 시킨다. 


		
		
		
		
		
		
		
		
	}

}
