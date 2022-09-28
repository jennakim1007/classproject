package chapter10;

public class ExceptionClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// ClassNotFoundException : 클래스를 찾지 못했을 때의 예외 클래스
		try {
			Class c1 = Class.forName("Test");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
		}

		// ArithmeticException : 0으로 나누는 연산이 되었을 때의 예외클래스
		try {
			int num = 10 / 0;
		} catch (ArithmeticException e) {
		}

		// ArrayIndexOutOfBoundsException : 배열이 가지는 index의 범위를 벗어난 index를 지정 했을 때 발생하는 예외클래스
		int[] arr = new int[3];
		try {
			arr[3] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
		}

		// NegativeArraySizeException : 음수의 크기로 배열 크기를 정의 했을 때 발생하는 예외클래스
		try {
			String[] names = new String[-1];
		} catch (NegativeArraySizeException e) {
		}

		// NullPointerException : 참조변수에 null 값이 있는 상태에서 변수를 참조하거나 메소드를 호출할 때 발생하는 예외클래스
		// 값을 어딘가에서 받아올 때 null이 들어올 수도 있으니 사용
		String str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
		}

	}

}
