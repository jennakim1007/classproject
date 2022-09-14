package chapter02;

import java.util.Scanner;

public class Member {
	
	public static void main(String[] args) 
	{
		/*
		 * 앞서 생성 했던 Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다. 
		 * 
		 * ① String 타입의 이름을 저장할 수있는 변수 name을 정의해봅시다. 
		 * ② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다. 
		 * ③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다. 
		 * ④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다. 
		 * ⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		 */
		
		// 변수 : 데이터를 저장할 수 있는 메모리 공간을 생성하고 주소 역할을 하는 것. 
		
		Scanner in = new Scanner(System.in);
		// new 키워드 알아두기 
		
		String name = null;
		int age = 0;
		String nickName = null;
		double height = 0.0;
		boolean hasBook = false;
		// ㄴ 변수들의 초기화
		
		System.out.println("이름을 입력해주세요.>>> ");
		name = in.nextLine();
		
		System.out.println("나이를 입력해주세요.>>> ");
		age = in.nextInt();
		
		in.nextLine();
		// ㄴ 숫자 타입으로 반환해오는 경우 기재. 위 nextInt로 인한 오류를 없애기 위한 라인
		
		System.out.println("별명을 입력해주세요.>>> ");
		nickName = in.nextLine();
		
		System.out.println("키 정보를 입력해주세요.>>> ");
		height = in.nextDouble();
		
		System.out.println("책 보유 여부를 입력해주세요.>>> ");
		hasBook = in.nextBoolean();
		
		
		// name = "김나나";
		// age = 20;
		// height = 123.0;
		// hasBook = true;
		
		System.out.println("저의 이름은 " + name + "입니다.");
		System.out.println("나이는 " +age + "세 입니다.");
		System.out.println("별명은 " +nickName + "입니다.");
		System.out.println("키는 " +height + "cm 입니다.");
		System.out.println("자바 책의 보유여부 : " +hasBook);
		
	}
	
	// 자기 자신의 이름을 출력하는 메소드
	// 반환타입 : 없다 => void
	// 매개변수 : 없다 
	// 처리내용 : 자신의 이름을 출력한다.
	
	public static void printmyname(String name) 
	{
		System.out.println("안녕하세요. " + name + " 입니다. 반갑습니다. ");
		// 반환이 있다 -> return 사용해서 데이터 반환 
	}
	
	

}
