package chapter07;

public class SmartPhoneMain3 {

	public static void main(String[] args) {
		
		SmartPhoneImpl4 phone = new SmartPhoneImpl4("010-0000-0000", "Samsung");

		Application[] store = new Application[5];
		store[0] = new GameAppImpl("Game", "지뢰찾기", "Microsoft", 1000);
		store[1] = new GameAppImpl("Game", "프리쉘", "Microsoft", 3000);
		store[2] = new GameAppImpl("Game", "카드", "Microsoft", 2000);
		store[3] = new UtilAppImpl("Util", "유튜브", "Google", 3000);
		store[4] = new UtilAppImpl("Util", "인스타그램", "Facebook", 3000);
				
		Application app = phone.getApplication(store, "인스타그램");
		
		if(app!=null) {
			phone.installApp(app);
		} else {
			System.out.println("스토어에 찾으시는 애플리케이션이 없습니다. ");
		}
		
		Application installedApp = phone.getInstalledApp("인스타그램");
		if(installedApp!=null) {
			installedApp.displayAppInfo();
			installedApp.AppRun();
		}
		
				
	}

}
