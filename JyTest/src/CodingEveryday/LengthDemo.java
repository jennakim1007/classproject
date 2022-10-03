package CodingEveryday;

public class LengthDemo {
	
	public static void main(String[] args) {
		
//		String[] fruits = {"포도", "딸기", "사과", "배"};
//		System.out.println(fruits[1]);
		
		String[] fruits = new String[4];
		fruits[0] = "포도";
		System.out.println(fruits.length);
		fruits[1] = "딸기";
		fruits[2] = "사과";
		fruits[3] = "배";
		
		for(int i=0; i<fruits.length; i++) {
			String fruit = fruits[i];
			// System.out.println(fruit);
		}
		
		for(String e : fruits) {
			System.out.println(e);
		}
		
		
		
		
	}

}
