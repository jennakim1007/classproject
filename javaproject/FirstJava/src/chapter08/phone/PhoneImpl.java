package chapter08.phone;

public class PhoneImpl implements Phone {
	
	// Phone 에 만들었던 추상메소드 3개를 오버라이딩해야함 -> 오버라이딩 하지 않으면 해당클래스가 추상클래스가 된다. 
	
	boolean power;

	@Override
	public void call() {
		
		// 119에 전화를 합니다. 
		// 상수를 이용해서 번호를 만들고 출력 
		
		// valueOf -> String으로 변환 
		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);
		
		System.out.println(number1+number1+number9+" 에 전화를 합니다!!");
		// System.out.println(""+Phone.PHONE_NUM_1+PHONE_NUM_1+PHONE_NUM_9);
		
	}

	@Override
	public void turnOn() {
		
		// power가 true -> 전원이 켜진 상태
		// power가 false -> 전원이 꺼진 상태 
		if(!power) {
			power = true;
		}
		
	}

	@Override
	public void turnOff() {

		if(power) {
			power = false;
		}
		
	}


	
	
	
	
	
}
