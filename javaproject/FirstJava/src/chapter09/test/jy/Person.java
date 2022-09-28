package chapter09.test.jy;

public class Person {
	
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
	
	
	
	
	

}
