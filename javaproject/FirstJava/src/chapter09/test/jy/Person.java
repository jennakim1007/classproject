package chapter09.test.jy;

import chapter09.exam.Person;

public class Person {
	
	// Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 
	
	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;

		if(obj != null && obj instanceof Person) {
			Person person = (Person)obj;
			result = this.personNumber.equals(person.personNumber);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("김나나", "000000-1000000");
		Person p2 = new Person("김다다", "000000-1000000");
		Person p3 = new Person("김나나", "000000-2000000");
		
		System.out.println("p1과 p2는 같은 사람인가? => " + p1.equals(p2));
		System.out.println("p1과 p3는 같은 사람인가? => " + p1.equals(p3));
		
	}
	
	
	

}
