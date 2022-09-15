package chapter04;

public class IfTest {

	public static void main(String[] args) {
		
		int score = 70;
		
		// 60점 이상이면 PASS 출력 
		if(score>=60) {
			// 조건식의 결과가 true일 때 처리되는 구문 
			System.out.println("PASS");
		}
		
		// 60점 이상이면 PASS 출력, 60점 미만이면 FAIL 출력 
		if(score>=60) {
			System.out.println("PASS");
		} else {
			//조건식의 결과가 false일 때 처리되는 구문 
			System.out.println("FAIL");
		}
			
		// 90점 이상이면 A 출력, 80 점 이상이면 B 출력, 70점 이상이면 C 출력, 나머지는 FAIL
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			//score<90 && score>=80 으로 기재하지 않는 이유->위 if 에서 score>=90 이 되어있으므로 90미만 생략 가능
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else {
			System.out.println("FAIL");
		}
	
		
		

	}

}
