package chapter04;

public class ForLoopTest2 {

	public static void main(String[] args) {
		
		// 반복문의 중첩 
		// ex. 구구단 2단 (2*1=2, 2*2=4 ... 2*9=18) -> 반복(1씩 늘어나는 것)을 확인  
		
//		for(int i=1; i<=9 ;i++) {
//			System.out.println("2 X " + i + " = " + 2*i);
//		}

		// 단의 반복 : 2~-
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
			System.out.println("=========");
			
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " +j +" = " + i*j); 
			}
			System.out.println("=========");
		}
		
		
		
		
	}

}
