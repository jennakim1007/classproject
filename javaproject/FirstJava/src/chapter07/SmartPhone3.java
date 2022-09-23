package chapter07;

public class SmartPhone3 extends Phone{ // 상속
	
	String model;
	
	SmartPhone3(String phoneNumber, String model) {
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
		System.out.println("현재 사용중인 모델은 : " + model);
	}
	
	// 오버라이딩이 아닌 새롭게 정의한 메소드 playMusic
	void playMusic() {
		System.out.println("다이너마이트가 플레이 됩니다.");
	}
	
	
	public static void main(String[] args) {
		
		// 다형성
		// 상속관계에 있는 클래스들 간에 인스턴스 생성과 참조변수간의 정의
		// 조상클래스 타입의 변수(참조변수) = new 자손타입의 클래스(); 
		// 조상클래스 변수이름 = new 자손클래스이름();
		
		Phone phone = new SmartPhone3("010-000-0000", "IOS");
		Phone phone2 = new SmartPhone2("010-111-1111", "android");
		Phone phone3 = new SmartPhone();		
		
		// 조상 타입의 참조변수 선언은 조상타입의 멤버만 사용하겠다를 정의한 것이다. 
		/* ex. Phone 에는 call, number가 있고 SmartPhone3 에는 call, number, model 이 있다면
		 * 위와 같이 Phone phone = new SmartPhone3를 했을 때, call과 number 만 나온다. 
		 * model 은 SmartPhone3 에는 있지만 Phone 에는 없으므로 나오지 않는다. 
		 */
		
		System.out.println(phone.phoneNumber);
		phone.call();
		
		// 오류 : model, playmusic() 은 SmartPhone3 에는 있지만 Phone 에는 없음  
		// System.out.println(phone.model);  
		// phone.playMusic();
		
	}
	
	

}
