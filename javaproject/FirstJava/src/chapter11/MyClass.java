package chapter11;

public class MyClass<T> {
	
	// 제너릭 클래스
	// T - type 
	
	T val;
	
	T getValue() {
		
		return val;
		
	}
	
	void setValue(T val) {
		
		this.val = val;
		
	}
	
	public static void main(String[] args) {
		
		// 제네릭 클래스는 인스턴스 생성시에 타입을 결정한다. 
		MyClass<String> myClass = new MyClass<String>();
		String str = myClass.getValue();
		
		myClass.setValue("KING");
		System.out.println(myClass.getValue());
		
		
	}
	
	

}
