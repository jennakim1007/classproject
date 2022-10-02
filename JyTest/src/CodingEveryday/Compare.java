package CodingEveryday;

public class Compare {

	public static void main(String[] args) {

		//비교연산자(관계연산자) 연습
		System.out.println(1!=2);
		System.out.println(1>2);
		System.out.println(1<2);
		System.out.println(1>=2);
		System.out.println(1<=2);
		System.out.println(1==2);

		System.out.println("=======");

		// 문자와 문자 비교 
	    String a = "Hello world";
        String b = new String("Hello world");
        String c = "Hello world";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
		
		
		
	}

}
