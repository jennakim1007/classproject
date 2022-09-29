package chapter11;

import java.util.HashSet;
import java.util.TreeSet;

public class SmartPhoneTreeSetTest {

	public static void main(String[] args) {

		// SmartPhone 객체를 만들어서 HashSet 저장하고 싶음
		
		TreeSet<SmartPhone> set = new TreeSet<>();
		
		set.add(new SmartPhone("JAVA", "010-0000-0001"));
		set.add(new SmartPhone("SON", "010-8282-8280"));
		set.add(new SmartPhone("Spring", "010-8181-8189"));
		set.add(new SmartPhone("King", "010-8181-8188"));
		set.add(new SmartPhone("당근당근당근당근", "010-8383-8387"));
		set.add(new SmartPhone("당근당근당근당근당근당근", "010-8282-8282"));

		System.out.println("요소의 개수 : " + set.size());
		
		for(SmartPhone sp:set ) {
			System.out.println(sp);
		}
		
	}

	

}
