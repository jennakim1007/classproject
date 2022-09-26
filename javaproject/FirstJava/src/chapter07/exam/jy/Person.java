package chapter07.exam.jy;

import java.time.LocalDate;

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
		System.out.printf("안녕하세요. 저는 %s 입니다. %s 살입니다. ", this.name, getAge());
	}
	
	// 주민등록번호(personNumber)를 받아 나이를 계산하는 메소드
	int getAge() {
		
		int result = 0;
		
		// .substring()을 이용하여 특정 자리 값만 받는다. 
		String tempYear = personNumber.substring(0, 2); // 981213-1234567 에서 "98"만 받는다. 
		String tempGender = personNumber.substring(7, 8); // 981213-1234567 에서 "1"만 받는다. 
		
		// IntegerparseInt() 을 이용하여 문자열을 int 타입의 정수로 반환한다. 
		int curYear = LocalDate.now().getYear(); // 올해 년도를 받는다.
		int birthYear = Integer.parseInt(tempYear); // 981213-1234567 에서 생일 년도 2자리 "98"
		int genderVal = Integer.parseInt(tempGender); // 981213-1234567 에서 성별 1자리 "1"
		
		// 주민등록번호 뒷자리가 1이나 2이면 1900년대 사람으로 분류한다. 
		if(genderVal==1||genderVal==2) {
			result = curYear - (birthYear+1900);
		// 주민등록번호 뒷자리가 3이나 4이면 2000년대 사람으로 분류한다. 	
		} else if(genderVal==3||genderVal==4){
			result = curYear - (birthYear+2000);
		}
		
		return result;
		
	}
	

}
