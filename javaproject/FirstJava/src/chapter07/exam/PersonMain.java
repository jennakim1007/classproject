package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {

		/*
		 * main()메소드를 정의해봅시다. 
		 * ① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
		 * ② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
		 */

		Male m = new Male("son", "971122-1111111", "sonny"); // 인스턴스 생성
		Female f = new Female("King", "001224-4000000", "체육", 3);
				
		m.printInfo();
		m.hi();
		
		System.out.println();
		
		f.printInfo();		
		System.out.println();
		f.printSchoolInfo();
		
		Person p1 = m; // 형변환 생략 가능
		Person p2 = f;
		
		// p1.hi(); // hi()는 Person 클래스의 멤버가 아니기 때문에 호출이 불가하다.  
		// p2.printSchoolInfo(); // printSchoolInfo();는 Person 클래스의 멤버가 아니기 때문에 호출이 불가하다.  
		
		System.out.println();
		System.out.println("---------------");
		p2.printInfo();
		
		
		
	}

}
