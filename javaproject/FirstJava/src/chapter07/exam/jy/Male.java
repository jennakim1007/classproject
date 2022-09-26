package chapter07.exam.jy;

public class Male extends Person {

	// Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스를 정의해봅시다. 
	
	// 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	String nickName;
	
	// Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	public Male(String name, String personNumber, String nickname) {
		super(name, personNumber);
		this.nickName = nickName;
	}

	// 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	void printNickName() {
		System.out.println("별명은 " + nickName + " 입니다.");
	}

	// Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다
	@Override
	void printHello() {
		super.printHello();
		System.out.print("저는 남자입니다. ");
		System.out.println("별명은 " + nickName + " 입니다.");
	}
	
	
	
	
	
	
	
	

}
