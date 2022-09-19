package chapter05.exam;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
		
		System.out.println("===m1 test===");
		
		Member m1 = new Member("가나다", "010-1234-5678", "전공", 2, "e@a.com", 991209, "천호동");
		m1.showInfo();
		
		System.out.println();
		System.out.println("===m2 test===");
		
		
		Member m2 = new Member("가나다", "01012345678", "전공", 2, "e@a.com");
		m2.showInfo();
		
		System.out.println();
		System.out.println("===m3 test===");
		
		//사용자에게 정보를 받아 출력해보자. 
			
		String name = null;
		System.out.println("이름을 입력해주세요.");
		name = in.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNumber = in.nextLine();
		System.out.println("전공을 입력해주세요.");
		String major = in.next();
		System.out.println("학년을 입력해주세요.");
		int grade = in.nextInt();
		System.out.println("이메일 주소를 입력해주세요.");
		String email = in.next();
		System.out.println("생년월일을 입력해주세요.");
		int birth = in.nextInt();
		System.out.println("주소를 입력해주세요.");
		String address = in.next();
		
		System.out.println();
		System.out.println("===정보 출력===");
			
		Member m3 = new Member(name, phoneNumber, major, grade, email, birth, address);
			m3.showInfo();
			
		
		
	}

}
