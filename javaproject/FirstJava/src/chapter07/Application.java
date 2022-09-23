package chapter07;

public class Application {
	
	String type;
	String appName;
	String company;
	int size;
	
	// 생성자 
	public Application(String type, String appName, String company, int size) {
		super();
		this.type = type;
		this.appName = appName;
		this.company = company;
		this.size = size;
	}
	
	// 어플 실행 
	public void AppRun() {
		
	}
	
	// 어플 종료
	public void AppStop() {
		System.out.println(appName + "애플리케이션을 종료합니다.");
	}
	
	// 어플 정보 출력 
	public void displayAppInfo() {
		System.out.println("=================");
		System.out.println("애플리케이션 종  류 : "+this.type);
		System.out.println("애플리케이션 이  름 : "+this.appName);
		System.out.println("애플리케이션 개발사 : "+this.company);
		System.out.println("애플리케이션 사이즈 : "+this.size);
		System.out.println("=================");
	}

	
	// 오버라이딩
	@Override
	public String toString() {
		return "Application [type=" + type + ", appName=" + appName + ", company=" + company + ", size=" + size + "]";
	}
	
	

}
