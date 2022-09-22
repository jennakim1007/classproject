package ver02.jy;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		SmartPhone sp = SmartPhone.getInstance();
		
		while(true) {
			
			sp.printMenu(); // 6. 전화번호부 보기 
			
			// Integer : 기본형 타입을 객체로 만들 때 사용하는 클래스
			int select = Integer.parseInt(sp.sc.nextLine());
			
			switch(select) {
			case 1 : // 1. 연락처 저장 
				sp.insertContact();
				break; // break 빼먹지 않도록 주의 
			case 2 : // 2. 연락처 검색 
				sp.searchContact();
				break;
			case 3 : // 3. 연락처 수정
				sp.editContact();
				break;
			case 4 : // 4. 연락처 삭제
				sp.deleteContact();
				break;
			case 5 : // 5. 연락처 전체 출력	
				sp.printAllData();
				break;
			case 6 : // 종료
				System.out.println("프로그램을 종료합니다. ");
				return;
			}
			
			
			
			
		}
		
		
		
	}

}
