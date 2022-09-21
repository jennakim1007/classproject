package ver01;

import java.util.Scanner;

public class ContactMain1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Contact1 인스턴스 생성 : 생성자를 이용한 데이터 초기화
		Contact1 c1 = new Contact1("손흥민", "010-1234-5678", "son@gmail.com", "런던", "1987-01-02", "가족");
		System.out.println("이름 : " + c1.getName()); // getter를 이용하여
		System.out.println("전화번호 : " + c1.getPhoneNumber());
		System.out.println("이메일 : " + c1.getEmail());
		System.out.println("주소 : " + c1.getAddress());
		System.out.println("생일 : " + c1.getBirthday());
		System.out.println("그룹 : " + c1.getGroup());

		System.out.println();
		c1.printInfo();

		// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
		c1.setName("박지성"); // setter를 이용하여
		c1.setPhoneNumber("011-9876-5432");

		System.out.println();
		c1.printInfo();

		/////////////////

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("1. 입력시작 ㅣ 0. 종료");
			String select = in.nextLine();

			// 사용자 요청에 따른 프로그램 실행여부 => 분기처리
			if (select.equals("0")) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			} else if (!select.equals("1")) { // ! 를 이용하여 0과 1 이외 조건 설정
				System.out.println("올바른 요청이 아닙니다. ");
				continue; // 0도 아니고 1도 아닐 경우 while 처음으로 다시 돌아감
			}

			System.out.println("데이터 입력을 시작합니다. ");
			System.out.print("이름을 입력하세요. >>> ");
			String name = in.nextLine();
			System.out.print("전화번호를 입력하세요. >>> ");
			String phoneNumber = in.nextLine();
			System.out.print("이메일을 입력하세요. >>> ");
			String email = in.nextLine();
			System.out.print("주소를 입력하세요. >>> ");
			String address = in.nextLine();
			System.out.print("생일을 입력하세요. >>> ");
			String birthday = in.nextLine();
			System.out.print("그룹을 입력하세요. >>> ");
			String group = in.nextLine();

			Contact1 c = new Contact1(name, phoneNumber, email, address, birthday, group); // 인스턴스 생성 
			c.printInfo();

		}

	}

}
