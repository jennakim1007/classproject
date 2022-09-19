package chapter05.overload;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		// SmartPhone 인스턴스 생성 
		SmartPhone sp1 = new SmartPhone("RED",4.7f,"삼성",5);
		sp1.showInfo();
		
		System.out.println();
		
		SmartPhone sp2 = new SmartPhone("GOLD",5f,"애플",10);
		sp2.showInfo();
		
		System.out.println();
		
		SmartPhone sp3 = new SmartPhone();
		
		// SmartPhone sp3
		// new Smartphone
		// SmartPhone()
		
		System.out.println();
		System.out.println("===sp4===");
		
		SmartPhone sp4 = new SmartPhone("APPLE", 5.0f);
		sp4.showInfo();
		
		System.out.println();
		System.out.println("===sp5===");
		
		SmartPhone sp5 = new SmartPhone("APPLE");
		sp5.showInfo();
		
		
		
		
	}

}
