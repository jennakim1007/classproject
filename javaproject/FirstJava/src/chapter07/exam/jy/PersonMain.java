package chapter07.exam.jy;

public class PersonMain {

	public static void main(String[] args) {

		// Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다
		
		Male m = new Male("김남남", "001212-3333333", "별명");
		Female f = new Female("김여여", "911111-2345678", "1");
		
		// 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
		
		m.printHello();
		f.printHello();

	}

}
