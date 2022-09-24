package chapter07;

public class SmartPhoneImpl4 extends Phone {
	
	String model;
	Application[] installedApps;
	int cntOfApps;
	
	public SmartPhoneImpl4(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
		installedApps = new Application[100];
		cntOfApps=0;
	}
	
	void installApp(Application app) {
		installedApps[cntOfApps++]=app;
		System.out.println(app.appName + " 앱을 설치했습니다.");
	}
	
	Application getApplication(Application[] storeApps, String name) {
		Application app = null;
		for(int i=0; i<storeApps.length; i++) {
			if(storeApps[i].appName.equals(name)) {
				app = storeApps[i];
			}
		}
		return app;
	}
	
	Application  getInstalledApp(String name) {
		Application app = null;
		for(int i=0; i<cntOfApps; i++) {
			if(installedApps[i].appName.equals(name)) {
				app = installedApps[i];
			}
		}
		return app;
	}
	
	
	
	

}
