package chapter04;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		
		// 90점 이상 : A => score / 10 = 9, 10 
		// 80점 이상 : B => score / 10 = 8
		// 70점 이상 : C => score / 10 = 7
		// 나머지 : F
		
		int score = 91;
		char c = 'A';
		
		// key : int 가능한 숫자, String 
		// key : byte, short, int, char 
		switch(score/10) {
		/*case 10 : 
			System.out.println("A");
			break;
			*/
		case 9 : case 10 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default : 
			System.out.println("F");
		}
		
		
		
		
		

	}
	
	

}
