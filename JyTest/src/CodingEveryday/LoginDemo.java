package CodingEveryday;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {

		String id = args[0];
		
//		Scanner sc = new Scanner(System.in);
//		String id = sc.nextLine();
		
		if(id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		
	}

}
