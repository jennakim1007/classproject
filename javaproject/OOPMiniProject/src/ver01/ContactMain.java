package ver01;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {

		Contact c1 = new Contact("나나", "010-1234-5678", "nana@gmail.com", "가가", 20220920, "다다");
		c1.showContact();
		
		while(true) {

		Scanner in = new Scanner(System.in);
		System.out.println("이름 입력하세요");
		c1.setName(in.nextLine());
		System.out.println("전화번호 입력하세요");
		c1.setPhoneNumber(in.nextLine());
		System.out.println("이메일 입력하세요");
		c1.setEmail(in.nextLine());
		System.out.println("주소 입력하세요");
		c1.setEmail(in.nextLine());
		System.out.println("생일 입력하세요");
		c1.setBirthday(in.nextInt());
		System.out.println("그룹 입력하세요");
		c1.setGroup(in.next());
		
		c1.showContact();
		
		}

	}

}
