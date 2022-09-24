package chapter07;

public class UtilAppImpl extends Application {

	// 생성자 
	public UtilAppImpl(String type, String appName, String company, int size) {
		super(type, appName, company, size);
	}
	
	// 오버라이드
	@Override
	public void AppRun() {
		System.out.println(">>>>>>>>> " + appName + " 유틸을 실행해서 사진을 편집합니다.");
	}
	

}
