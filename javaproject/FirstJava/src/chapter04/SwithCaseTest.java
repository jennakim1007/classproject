package chapter04;

public class SwithCaseTest {

	public static void main(String[] args) {
		
		int key = 1;
		
		// switch case :  특정 값 하나를 비교해서 분기하는 조건문 
		// key 값과 case 다음에 오는 value 값을 비교해서 실행 
		switch (key) {
		case 1:
			System.out.println("1의 결과 !!!!");
			// DB
			// 변수 
			// 연산 
			// 메소드 호출
			// 객체 생성 
			break;

		case 2 : 
			System.out.println("2일 때 처리");
			break;
			
		default: // 위에 정의된 case 조건에 부합하지 않는 나머지 
			System.out.println("1이 아닌 나머지 ");
			break; // -> 생략 가능 
		}

	}

}
