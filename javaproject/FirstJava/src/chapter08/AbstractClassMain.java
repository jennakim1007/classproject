package chapter08;

public class AbstractClassMain {
	
	public static void main(String[] args) {
		
		// 추상 클래스는 인스턴스 생성에 목적이 없다!
		// 인스턴스 생성을 하면 문제가 된다!!!
		
		AbstractClass abstractClass; // = new AbstractClass(); // 인스턴스 생성 불가
		
		NewClass newClass = new NewClass(); // 인스턴스 생성 -> 오버라이딩하여 완성이 되어있으므로 가능 
		newClass.abstractMethod();
		
		abstractClass = newClass; // 다형성 => 상위타입참조변수 = 하위타입인스턴스 
		
		abstractClass.abstractMethod();
		
		newClass.printData();
		
	}

}
