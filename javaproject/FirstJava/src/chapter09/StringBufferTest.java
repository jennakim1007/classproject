package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
	
		// StringBuffer, StringBuilder
		// 동기화 문제 관련 차이 
		
		StringBuffer sb = new StringBuffer("Hello"); // 6+16 // 16을 붙여줌 
		
		System.out.println(sb);
		
		// 문자열 붙이기
		// String 에서는 .concat() 사용 StringBuffer 에서는 .append() 사용 
		
		sb.append("~");
		sb.append(false);
		
		System.out.println(sb);
		
		// 특정 문자열 삭제 
		System.out.println(sb.delete(0, 1));

		// 특정위치에 문자열 삽입
		System.out.println(sb.insert(6, "~"));
		System.out.println(sb.insert(sb.length(), true)); // length 제일 끝에 insert 하겠다는 뜻 = .append()와 같은 기능
		
		System.out.println(sb.reverse()); // 역순 
		
		
	}

}
