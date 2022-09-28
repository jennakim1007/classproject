package chapter10;

public class ExceptionTest3 {

	public static void main(String[] args) throws ClassNotFoundException {

		check1();
		

	}
	
	static void check1() throws ClassNotFoundException {
		
		check2();
		
	}
	
	static void check2() throws ClassNotFoundException {
		
		Class.forName("NULL");
		
	}
	
	

}
