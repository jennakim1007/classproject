package chapter03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// 논리연산자 연습 
		
		boolean chk1 = true;
		boolean chk2 = false;
		boolean chk3 = true;
		boolean chk4 = false;
		
		// && AND 논리연산자 연습 
		System.out.println(chk1 && chk3); // true && true -> Console : true 
		System.out.println(chk1 && chk2); // true && false -> false  
		System.out.println(chk2 && chk3); // false && true -> false 
		System.out.println(chk2 && chk4); // false && false -> false 
		
		System.out.println("----------------------------------------");
		
		// || OR 논리연산자 연습 
		System.out.println(chk1 || chk3); // true && true -> Console : true 
		System.out.println(chk1 || chk2); // true && false -> Console : true 
		System.out.println(chk2 || chk3); // false && true -> Console : true 
		System.out.println(chk2 || chk4); // false && false -> Console : false

		
		
		
		
		

	}

}
