package chapter07;

public class SmartPhoneImpl3 extends Phone {
	
	String model;
	// 배열 변수 선언 : 배열 변수는 배열이 생성된 후에 배열 인스턴스에 접근하기 위해 사용
	// 자료형타입[] 배열이름 
	GameAppImpl[] gameApps;
	UtilAppImpl[] utilApps;
	
	// 어플 개수
	int gameAppCnt = 0;
	int utilAppCnt = 0;
	
	// 생성자 
	public SmartPhoneImpl3(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
		
		// 배열의 인스턴스를 생성 
		gameApps = new GameAppImpl[100];
		utilApps = new UtilAppImpl[100];		
	}
	
	// 게임 앱만 설치하는 메서드 
	void installApp(GameAppImpl app) {
		gameApps[gameAppCnt++] = app;
		System.out.println(app.appName + " 앱을 설치했습니다.");
	}
	
	// 유틸 앱만 설치하는 메서드
	void installApp(UtilAppImpl app) {
		utilApps[utilAppCnt++] = app;
		System.out.println(app.appName + " 앱을 설치했습니다.");
	}
	
	
	

}
