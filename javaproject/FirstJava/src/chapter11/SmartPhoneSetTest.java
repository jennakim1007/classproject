package chapter11;

import java.util.HashSet;

public class SmartPhoneSetTest {

	public static void main(String[] args) {

		// SmartPhone 객체를 만들어서 HashSet 저장하고 싶음
		
		HashSet<SmartPhone> set = new HashSet<>();
		
		set.add(new SmartPhone("당근", "010-8181-8181"));
		set.add(new SmartPhone("당근당근", "010-8282-8282"));
		set.add(new SmartPhone("당근당근당근", "010-8181-8181"));
		set.add(new SmartPhone("당근당근당근당근", "010-8181-8181"));
		set.add(new SmartPhone("당근당근당근당근당근", "010-8383-8383"));
		set.add(new SmartPhone("당근당근당근당근당근당근", "010-8282-8282"));

		System.out.println("요소의 개수 : " + set.size());
		
		for(SmartPhone sp:set ) {
			System.out.println(sp);
		}
		
	}

	

}
