package chapter04;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		// do while : 먼저 한 번을 반드시 처리한 후 반복해야 할 경우 사용한다. 
		
		int cnt = 0;
		
		do {
			// 반복할 문장 
			System.out.println("JAVA " + cnt);
			cnt++;
		} while(cnt < 0);
		
	}
	
}
