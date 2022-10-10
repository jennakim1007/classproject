package CodingEveryday;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
			if(sc.equals("종료")) {
				break;
			}
		}
		
		sc.close();
		
	}

}
