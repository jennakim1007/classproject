package chapter09.exam;

public class Person {

	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	// 주민등록번호가 같으면 같은 인스턴스로 판별하는 프로그램을 만들어봅시다.
	// "000000-0000000"
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		// 매개변수로 전달받은 객체와 비교 : 주민등록번호
		if(obj!=null && obj instanceof Person) {
			// Object -> Person 으로 형변환
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
