package chapter07;

public class SmartPhone2 extends Phone{ // 상속
	
	String model;
	
	SmartPhone2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	} // 초기화
	
	// 오버라이딩
	// 상위 클래스에서 정의한 메소드를 재정의
	// 선언부는 동일하게 정의하고, 처리 블록 내부의 코드만 재정의 
	@Override //어노테이션 // 오버라이딩 기준에 맞는지 확인해준다. 실수방지 
	void call() {
		
		super.call(); // super 를 통해 상위 클래스에 있는 기능을 가져온다 
		System.out.println("이어팟을 이용해서 통화합니다.");
	}
	
	public static void main(String[] args) {
		
		SmartPhone2 phone2 = new SmartPhone2("010-0000-0000", "삼성");
		
		// call() 호출 
		phone2.call();
		
		
	}
	
	

}
