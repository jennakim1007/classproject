package chapter11;

import chapter08.phone.Phone;
import chapter08.phone.PhoneImpl;

public class GenericMethodByType {
	
	// 제너릭 타입의 메소드
	
	public <T extends Phone> void hello(T t) {
		// System.out.println("안녕하세요. " + t.toString() + "입니다. ");
		
		t.call();
		
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType byType = new GenericMethodByType();
		// byType.<String>hello("당근당근"); // String 타입만 지정!
		// byType.hello(10); // 타입을 지정하지 않음
		
		// byType.<PhoneImpl>hello(new PhoneImpl());
		byType.hello(new PhoneImpl());

	
	}
	
	
	

}
