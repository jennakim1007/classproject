package chapter04;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		
		// 회원 등급에 따른 권한을 정리해보자. 
		
		String grade = "admin"; 
		// grade : admin / manager / member / anyone
		// grade에 따른 기능 : 읽기 / 쓰기 / 회원 승인 / 지표 보기 
		
		// if 로 처리
		if(grade.equals("admin")) {
			System.out.println("지표 보기 가능");
			System.out.println("회원 승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 기능 가능");
			
		} else if(grade.equals("manager")) {
			System.out.println("회원 승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 기능 가능");
			
		} else if(grade.equals("member")) {
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 기능 가능");
			
		} else {
			System.out.println("읽기 기능 가능");
		}
		
		// switch 로 처리
		switch(grade) {
		case "admin" :
			System.out.println("지표 보기 가능");
		case "manager" :
			System.out.println("회원 승인 가능");
		case "member" :
			System.out.println("쓰기 기능 가능");
		default : 
			System.out.println("읽기 기능 가능");
		}
	
		

	}

}
