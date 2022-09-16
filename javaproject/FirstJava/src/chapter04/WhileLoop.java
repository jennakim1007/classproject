package chapter04;

public class WhileLoop {

	public static void main(String[] args) {
		
		int cnt = 0;
		
		// 무한반복을 이용해서 5번 출력해보자. 
		while(true) {
			System.out.println("JAVA");
			
			if(++cnt>4) {
				break; // 몇 번 반복해야할지 모를 때 조건문을 이용하여 반복을 멈춘다.  
			}
		}
		
		
		// 1. 짝수이면서 : num%2 == 0  
		// 2. 7의 배수인 수 : num%7 == 0
		int num = 1;
	
		while(true) {
			if(num%2==0 && num%7==0) {
				System.out.println("짝수이면서 7의 배수인 0과 가장 가까운 수 : " + num);
				break;
			} else {
				num++;
			}
			
		}
		
		
		
	}

}
