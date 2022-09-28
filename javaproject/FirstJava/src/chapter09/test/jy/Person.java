package chapter09.test.jy;

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
		if(obj != null && obj instanceof Person) {
			
		
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	

}
