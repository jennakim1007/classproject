package chapter07.exam.jy;

public class Female extends Person {

	// Person 클래스를 상속해서 확장하는 새로운 클래스 Female 클래스를 정의해봅시다. 
	
	// 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	String grade;
	
	// Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	public Female(String name, String personNumber, String grade) {
		super(name, personNumber);
		this.grade = grade;
	}
	
	// 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	void printGrade() {
		System.out.println(grade + "학년 입니다.");
	}

	// Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다
	@Override
	void printHello() {
		super.printHello();
		System.out.print("저는 여자입니다. ");
		System.out.println(grade + "학년 입니다.");
	}
	
	
	
	
	
	
	
	

}
