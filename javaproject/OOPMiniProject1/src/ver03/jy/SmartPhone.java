package ver03.jy;

import java.util.Scanner;

public class SmartPhone {
	
	/* 스마트폰 기능 
	 * 1. 연락처 저장
	 * 2. 연락처 검색
	 * 3. 연락처 수정
	 * 4. 연락처 삭제
	 * 5. 연락처 전체 출력
	 */
	
	private Contact[] contacts; // 배열 변수 선언 // 자료형타입[] 배열이름 
	private int numOfContact; 
	Scanner sc;
	
	private SmartPhone(int size) {
		contacts = new Contact[size]; // 배열의 생성 // 배열 이름 = new 자료형타입[배열 요소의 개수]
		numOfContact = 0;
		sc = new Scanner(System.in);
	}
	
	private static SmartPhone sp = new SmartPhone(10);
	
	public static SmartPhone getInstance() {
		if(sp==null) {
			sp = new SmartPhone(10);
		}
		return sp;
	} 
	
	// 1. 연락처 저장 
	void insertContact() {
		
		Scanner sc = new Scanner(System.in);
		
		if(numOfContact==contacts.length) { 
			System.out.println("최대 저장 개수는 "+contacts+"개 입니다.");
			return;
		}
		
		System.out.println("저장할 연락처 타입을 입력하세요.");
		System.out.println("1. 회사 \t2. 고객");
		int select = Integer.parseInt(sc.nextLine());
		
		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;
		
		System.out.println("입력을 시작합니다. ");
		System.out.print("이름 > ");
		name = sc.nextLine();
		System.out.print("전화번호 > ");
		phoneNumber = sc.nextLine();
		System.out.print("이메일 > ");
		email = sc.nextLine();
		System.out.print("주소 > ");
		address = sc.nextLine();
		System.out.print("생일 > ");
		birthday = sc.nextLine();
		System.out.print("그룹 > ");
		group = sc.nextLine();
		
		// 인스턴스 생성 
		Contact contact = null;
		
		if(select==1) {
			
			System.out.print("회사이름 > ");
			String company = sc.nextLine();
			System.out.print("부서이름 > ");
			String division = sc.nextLine();
			System.out.print("직급 > ");
			String manager = sc.nextLine();
			
			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, division, manager);
			
		}else if(select==2){
			
			System.out.print("거래처이름 > ");
			String company = sc.nextLine();
			System.out.print("거래품목 > ");
			String product = sc.nextLine();
			System.out.print("직급 > ");
			String manager = sc.nextLine();
			
			contact = new CustomerContact(name, phoneNumber, email, address, birthday, group, company, product, manager);
			
		}		
		
		// numOfContact++ == 배열길이
		contacts[numOfContact++] = contact; 
		
	}
	
	// 2. 연락처 검색
	void searchContact() {
		
		String name = null;
		System.out.println("검색을 시작합니다.");
		System.out.println("검색할 이름을 입력하세요. >");
		name = sc.nextLine();
		
		Contact contact = null;
		
		for(int i=0; i<numOfContact; i++) {
			if(contacts[i].getName().equals(name)) {
				contact = contacts[i];
				break;
			}
		}
		System.out.println("=====검색 결과=====");
		if(contact==null) {
			System.out.println("검색한 이름 " + name + "의 정보가 없습니다. ");
		} else {
			contact.printContact();
		}
		
	}
	
	// 3. 연락처 수정 (이름 검색 후 연락처 수정, 중복 이름 없다고 가정)
	void editContact() {
		
		System.out.println("데이터 수정이 진행됩니다. ");
		System.out.println("수정하고자 하는 이름을 입력해주세요. > ");
		String name = sc.nextLine();
		
		int searchIndex = -1; // index 값이 될 수 없는 음수를 넣어서 삭제할 수 없는 데이터 분류
		
		for(int i=0; i<numOfContact; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		if(searchIndex<0) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}
		Contact contact = contacts[searchIndex];
		
		System.out.println("데이터 수정을 진행합니다. ");
		System.out.println("변경하고자하는 이름을 입력해 주세요. (현재값 : " + contact.getName() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newName = sc.nextLine();
		
		// trim-> 공백제거 // 사용자가 공백만 잘못치는 것 방지 등을 위해 사용하였음 
		if(newName != null && newName.trim().length()>0) {
			contact.setName(newName);
		}
		
		System.out.println("변경하고자하는 전화번호를 입력해 주세요. (현재값 : " + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newPhoneNumber = sc.nextLine();
		
		if(newPhoneNumber != null && newPhoneNumber.trim().length()>0) {
			contact.setPhoneNumber(newPhoneNumber);
		}
		
		System.out.println("변경하고자하는 이메일를 입력해 주세요. (현재값 : " + contact.getEmail() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newEmail = sc.nextLine();
		
		if(newEmail != null && newEmail.trim().length()>0) {
			contact.setEmail(newEmail);
		}
		
		System.out.println("변경하고자하는 주소를 입력해 주세요. (현재값 : " + contact.getAddress() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newAddress = sc.nextLine();
		
		if(newAddress != null && newAddress.trim().length()>0) {
			contact.setAddress(newAddress);
		}
		
		System.out.println("변경하고자하는 생일을 입력해 주세요. (현재값 : " + contact.getBirthday() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newBirthday = sc.nextLine();
		
		if(newBirthday != null && newBirthday.trim().length()>0) {
			contact.setBirthday(newBirthday);
		}
		
		System.out.println("변경하고자하는 그룹을 입력해 주세요. (현재값 : " + contact.getGroup() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newGroup = sc.nextLine();
		
		if(newGroup != null && newGroup.trim().length()>0) {
			contact.setGroup(newGroup);
		}
		
		if(contact instanceof CompanyContact) {
			
			CompanyContact companyContact = (CompanyContact)contact;
			
			System.out.println("변경하고자 하는 회사이름을 입력해 주세요.(현재값 : " + companyContact.getCompany() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newCompany = sc.nextLine();
			if(newCompany != null && newCompany.trim().length()>0) {
				companyContact.setCompany(newCompany);
			}
			
			System.out.println("변경하고자 하는 부서이름을 입력해 주세요.(현재값 : " + companyContact.getDivision() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newDivision = sc.nextLine();
			if(newDivision != null && newDivision.trim().length()>0) {
				companyContact.setDivision(newDivision);
			}
			
			System.out.println("변경하고자 하는 직급을 입력해 주세요.(현재값 : " + companyContact.getManager() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newManager = sc.nextLine();
			if(newManager != null && newManager.trim().length()>0) {
				companyContact.setManager(newManager);
			}
		}
		
		if(contact instanceof CustomerContact) {
			
			CustomerContact customerContact = (CustomerContact)contact;
			
			System.out.println("변경하고자 하는 거래처이름을 입력해 주세요.(현재값 : " + customerContact.getCompany() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newCompany = sc.nextLine();
			if(newCompany != null && newCompany.trim().length()>0) {
				customerContact.setCompany(newCompany);
			}
			
			System.out.println("변경하고자 하는 품목을 입력해 주세요.(현재값 : " + customerContact.getProduct() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newProduct = sc.nextLine();
			if(newProduct != null && newProduct.trim().length()>0) {
				customerContact.setProduct(newProduct);
			}
			
			System.out.println("변경하고자 하는 직급을 입력해 주세요.(현재값 : " + customerContact.getManager() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newManager = sc.nextLine();
			if(newManager != null && newManager.trim().length()>0) {
				customerContact.setManager(newManager);
			}
		}
		
		System.out.println("정보가 수정되었습니다. ");
		System.out.println();
		
	}
	
	// 4. 연락처 삭제 (이름 검색 후 연락처 삭제, 중복 이름 없다고 가정)
	void deleteContact() {
		
		System.out.println("데이터 삭제가 진행됩니다. ");
		System.out.println("삭제하고자 하는 이름을 입력해주세요. > ");
		String name = sc.nextLine();
		
		int searchIndex = -1; // 위 연락처 수정과 마찬가지로, index 값이 없는 것을 찾기 위해 음수값 사용
		
		for(int i=0; i<numOfContact; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		
		if(searchIndex<0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 존재하지 않습니다. ");
		} else {
			for(int i=searchIndex; i<numOfContact-1; i++) {
				contacts[i] = contacts[i+1];
			}
			numOfContact--;
			System.out.println("데이터가 삭제되었습니다. ");
		}
		
		
		
		
	}
	
	// 5. 연락처 전체 출력 
	void printAllData() {
		
		System.out.println("----전체 데이터를 출력합니다----");
		
		if(numOfContact==0) {
			System.out.println("입력된 정보가 없습니다. ");
			return;
		}
		
		for(int i=0; i<numOfContact; i++) {
			contacts[i].printContact();
		}

	}
	
	// 6. 전화번호부 보기
	static void printMenu() {
		
		System.out.println("=========================");
		System.out.println("# 전화번호부");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println("=========================");
		System.out.println("원하시는 메뉴 번호를 입력해주세요. >");
		
	}
	
}