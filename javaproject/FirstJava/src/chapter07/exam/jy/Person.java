package chapter07.exam.jy;

public class Person {
	
	// 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다. 
	String name;
	String personNumber;
	
	// Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	// 인사하는 메소드를 정의해봅시다. 
	void printHello() {
		System.out.printf("안녕하세요. 저는 %s 입니다. %s 살입니다. ", this.name, this.personNumber);
	}

}
