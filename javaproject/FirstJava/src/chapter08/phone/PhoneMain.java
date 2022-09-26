package chapter08.phone;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneImpl phone1 = new PhoneImpl();
		
		phone1.call();
		
		SmartPhone2 smartPhone2 = new SmartPhone2("hot@gmail.com");
		smartPhone2.turnOn();
		smartPhone2.call();
		
		System.out.println();
		smartPhone2.appRun("인스타그램");
		System.out.println();
		smartPhone2.appStop("카카오톡");
		smartPhone2.turnOff();
		
		Computer phone02 = smartPhone2;
		// Computer를 SmartPhone2 가 상속하고 있음
		Phone phone03 = smartPhone2;
		Application phone04 = smartPhone2;
		// SmartPhone2를 Phone, Application 인터페이스 구현하고 있음 
		
		
		System.out.println("===================");
		Phone phone01 = phone1; // 형변환 연산 생략
		// 상위 타입인 Phone = 하위 타입인 PhoneImpl
		phone01.turnOn();
		phone01.call();
		phone01.turnOff();
		
		System.out.println("===================");
		SmartPhone3 phone3 = new SmartPhone3("naver.com");
		phone3.turnOn();
		phone3.call();
		phone3.appRun("네이버");
		phone3.appStop("네이버");
		phone3.turnOff();
		
		Phone phone05 = phone3;
		Phone[] list = new Phone[3];
		list[0] = phone1;
		list[1] = smartPhone2;
		list[2] = phone3;
		
		for(int i=0; i<list.length; i++) {
			list[i].turnOn();
		} // 전체 핸드폰 일괄로 켜주기 
		
		
	}

}
