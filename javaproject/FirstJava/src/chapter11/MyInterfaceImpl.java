package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}
	
	public static void main(String[] args) {
		
		// 제너릭 : 인스턴스 생성시 타입 지정 
		MyInterfaceImpl<String, Integer> myClass = new MyInterfaceImpl<String, Integer>(); // 참조형 타입이 와야함 
		
		System.out.println(myClass.method1("Ten"));
		System.out.println(myClass.method2(10)); 
		
	}
	
	
	
	
	

}
