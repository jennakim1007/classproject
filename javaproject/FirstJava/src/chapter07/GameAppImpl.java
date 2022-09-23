package chapter07;

public class GameAppImpl extends Application {

	// 1. 생성자는 상속되지 않고, 자식클래스로 인스턴스를 생성할 때 자동적으로 부모클래스의 기본생성자가 호출된다
	// 2. 부모생성자가 매개변수를 가지고 있다면 자식클래스를 인스턴스화 할 때 자동으로 호출되지 않으므로,
	//	  자식생성자에서 명시적으로 부모생성자를 호출하여야 한다. 이 때 사용되는 키워드가 super() 이다. 
	// 	  super() 는 자식생성자의 첫 줄에 위치 해야 한다!!!
	
	// 생성자
	public GameAppImpl(String type, String appName, String company, int size) {
		super(type, appName, company, size);
	} 
	
	// 오버라이드
	// Application 클래스에 있는 AppRun 메소드를 오버라이드
	@Override
	public void AppRun() {
		System.out.println(">>>>>>>>> " + appName + " 게임을 합니다.");
	}

}
