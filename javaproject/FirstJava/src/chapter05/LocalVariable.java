package chapter05;

public class LocalVariable {
	
	void method(int num) {
		// 매개변수도 지역변수이다.
		
		int lv = 10;	// 메소드 내부에서 선언되는 변수도 지역변수이다. 
		
		if(num>10) {
			boolean check = true;
		} else {
			boolean check = false;
		}
		
		// int lv = 100;
		
		for(int i=0; i<10; i++) {
			// i는 for 블럭 안에서만 사용가능한 지역변수이다. 
			System.out.println(num++);
		}
		// System.out.println(i); // -> 오류사유 : 위 for 블럭이 끝나서 지역변수 i 가 소멸됐기 때문
		
		while(lv<0) {
			int lv2 = 0;
			System.out.println(num++);
		}
		
	}
	
	public static void main(String[] args) {
		
		LocalVariable lv = new LocalVariable();
		lv.method(0);
		
	}

}
