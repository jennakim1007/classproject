package chapter03;

public class RelationalOperator2 {

	public static void main(String[] args) 
	{
		// 관계연산자 ( 비교연산자 )
		// 참조변수 : 주소를 가지는 변수 
		// 주소 : 객체를 가르키는 주소 값 
		// 크다작다 비교는 하지 않는다. 
		
		String str1 = "JAVA";
		String str2 = "HTML";
		String str3 = "JAVA";
		
		System.out.println(str1 == str2);  // 주소값 == 주소값 *많이 쓰인다
		System.out.println(str1 != str2);
		System.out.println("str1 == str3 => " + ( str1 == str3 )); 
		// str1 == str3 괄호처리사유 -> + 산술연산이 먼저되어 값이 나오지 않음으로, == 비교연산이 먼저 될 수 있도록 묶어준다.   
		
		// System.out.println(str1 > str2);  -> 크다작다 비교할 수 없음 
		
		
		
		
	}

}
