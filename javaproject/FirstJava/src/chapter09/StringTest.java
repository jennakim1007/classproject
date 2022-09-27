package chapter09;

public class StringTest {

	public static void main(String[] args) {

		// 문자열을 다루는 String 
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		System.out.println("str1==str2 => " + (str1==str2) );
		System.out.println("str1==str3 => " + (str1==str3) );
		
		System.out.println(str1.equals(str3));
		
		// 특정 타입의 데이터 -> 문자열 String 타입으로 변경 
		String str4 = "" +1;
		String str5 = String.valueOf(false);
		String str6 = new String();
		System.out.println(str5);
		
		/////////////////////////////
		System.out.println("==============================\n");
		
		String str = "Hello~";
		System.out.println(str.toString());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		
		// 문자열을 역순으로 출력해보자 
		System.out.print("문자열 출력 ");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\n역순 출력 ");
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~~"));
		System.out.println(str.compareTo("Hello"));
		
		// 문자열의 합 .concat()
		System.out.println(str.concat(str1)); // "Hello~" + "String"
		
		// 포함 확인  .contains()
		System.out.println(str.contains("He"));
		System.out.println(str.contains("bye"));
		
		System.out.println(str.startsWith("He"));
		System.out.println(str.endsWith(".pdf")); // 확장자 찾기에 활용 가능 
		
		System.out.println(str.equals("top"));
		System.out.println(str.equals("Hello~"));
		
		// 특정 위치 인덱스 값 찾기 
		System.out.println();
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
		// Hello~ 
		System.out.println(str.indexOf("o~"));
		
		// .trim() -> 공백 제거 
		System.out.println();
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty()); 
		System.out.println(" ".trim().isEmpty());
		
		System.out.println(str.length());
		System.out.println(str.length()==0); // isEmpty와 같은 의미 
		
		System.out.println();
		// 문자열 치환 
		System.out.println(str.replace("~", "!!!!"));
		
		
		
	}

}
