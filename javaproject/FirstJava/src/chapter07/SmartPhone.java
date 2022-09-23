package chapter07;

public class SmartPhone extends Phone{
	
	// 하위 클래스 : 상위 클래스 멤버 + 새로운 멤버 정의 
	String model;
	
	SmartPhone() {
		super("010-1111-3333"); // super 키워드 통해 상위클래스 생성자 호출 
		this.model = "IOS";
	}
	
	// 전화번호만 초기화
	SmartPhone(String phoneNumber) {
		super(phoneNumber); // 기재 순서 : super가 위에 있음 // this 순서가 위로가면 오류난다. 
		this.model = "android";
	}
	
	SmartPhone(String phoneNumber, String model){
		super(phoneNumber);
		this.model = model;
	}
	
	void play() {
		System.out.println("app을 실행합니다. ");
	}
	
	
	public static void main(String[] args) {
		
		// SmartPhone sp = new SmartPhone(); // 인스턴스 생성
		// SmartPhone sp = new SmartPhone("010-1111-5555");
		SmartPhone sp = new SmartPhone("010-7777-7777", "Google");
		
		System.out.println(sp.phoneNumber);
		sp.call();
		System.out.println(sp.model);
		sp.play();
		
	}
	

}
