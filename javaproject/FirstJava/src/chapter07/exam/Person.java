package chapter07.exam;

import java.time.LocalDate;
import java.util.Calendar;

import javax.print.attribute.standard.PrinterInfo;

public class Person {
	
	// Person 이라는 클래스를 정의해봅시다. 
	// ① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	// ② 인사하는 메소드를 정의해봅시다.(안녕하세요. 저는 OOO입니다. 00살 입니다.)

	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	// 주민등록번호를 받아서 나이를 반환하는 메소드, 주민등록번호는 멤버 변수인 personNumber 값을 이용해서 처리
	int getAge() {
		
		// 반환하는 나이
		int result = 0;
		
		// 나이를 계산해서 반환하는 연산 
		// 0123456789... 문자열의 index -> 문자들의 위치값 
		// .substring( ,  ); 를 이용하여 생년 두 자리 값만 받기 
		String tempYear = personNumber.substring(0, 2); // 년도 "00", "99"
		String tempGender = personNumber.substring(7, 8); // 성별 "1,2,3,4"
		
		// 00-> 2000년생 이상 -> 년도 => "00" 을 int 로 바꾸고 +2000
		// 99 -> 1900년생 이상 -> 년도 => "99" 를 int 로 바꾸고 +1900
		// 891111-2000000
		// 010203-3000000
		// 주민등록번호 뒷자리 1||2 => 1900+89 
		// 주민등록번호 뒷자리 3||4 => 2000+01
		
		// Interger.parseInt("문자열"); -> int 타입의 정수 반환 
		// 나이 구하기 : 올해 년도 - 태어난 년도
		// int curYear = Calendar.getInstance().get(Calendar.YEAR); // 싱글톤
		// Date - > LocalDate, LocalDatetime, LocalTime
		int curYear = LocalDate.now().getYear(); // 올해 년도 
		int birthYear = Integer.parseInt(tempYear); // 년도 2자리 
		int genderVal = Integer.parseInt(tempGender); // 성별 
		
		if(genderVal==1||genderVal==2) {
			result = curYear - (1900+birthYear);
		} else if(genderVal==3||genderVal==4){
			result = curYear - (2000+birthYear);
		}
		
		return result;
		
	}
	
	void printInfo() {
		System.out.printf("안녕하세요. 저는 %s입니다. %d살 입니다.", this.name, getAge());
	}
	
	public static void main(String[] args) {
		
		LocalDate curDate = LocalDate.now();
		System.out.println(curDate);
		System.out.println(curDate.getYear());
		
		int curYear = LocalDate.now().getYear(); // 올해 년도 
		
		Person p = new Person("son", "001111-3000000"); // 인스턴스 
		p.printInfo();
		
	}
	

}
