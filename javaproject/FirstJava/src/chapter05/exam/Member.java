package chapter05.exam;

public class Member {
	
	// ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String phoneNumber;
	String major;
	int grade;
	String email;
	int birth;
	String address;
	
	// ③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	Member(String name, String phoneNumber, String major, int grade, String email, int birth, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}
	
	Member(String name, String phoneNumber, String major, int grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.address = "알 수 없음";
	}
	
	// ② 위에서 정의한 정보를 출력하는 메소드 정의 
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		System.out.println("생일 : " + birth);
		System.out.println("주소 : " + address);
	}
	
		
	
	
	

}
