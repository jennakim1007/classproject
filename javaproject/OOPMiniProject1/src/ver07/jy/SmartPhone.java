package ver07.jy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SmartPhone {

	/*
	 * 스마트폰 기능 1. 연락처 저장 2. 연락처 검색 3. 연락처 수정 4. 연락처 삭제 5. 연락처 전체 출력
	 */

	List<Contact> contacts;
	Scanner sc;
	
	private SmartPhone() {
		contacts = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	private static SmartPhone sp = new SmartPhone();

	public static SmartPhone getInstance() {
		if (sp == null) {
			sp = new SmartPhone();
		}
		return sp;
	}

	// 1. 연락처 저장
	void insertContact() {

		Scanner sc = new Scanner(System.in);

		if (contacts.size()==100) { // 최대 저장 개수 100개 
			System.out.println("최대 저장 개수는 " + contacts + "개 입니다.");
			return;
		}

		System.out.println("저장할 연락처 타입을 입력하세요.");
		System.out.println("1. 회사 \t2. 고객");
		int select = Integer.parseInt(getString());

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;

		System.out.println("입력을 시작합니다. ");
		System.out.print("이름(영문자, 한글) > ");
		name = getName(); // 공백, 영문자, 한글 체크
		System.out.print("전화번호(숫자) > ");
		phoneNumber = getPhoneNumber(); // 공백, 중복 체크
		System.out.print("이메일 > ");
		email = getString(); // 공백 체크
		System.out.print("주소 > ");
		address = getString();
		System.out.print("생일 > ");
		birthday = getString();
		System.out.print("그룹 > ");
		group = getString();

		// 인스턴스 생성
		Contact contact = null;

		if (select == 1) {

			System.out.print("회사이름 > ");
			String company = getString();
			System.out.print("부서이름 > ");
			String division = getString();
			System.out.print("직급 > ");
			String manager = getString();

			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, division,
					manager);

		} else if (select == 2) {

			System.out.print("거래처이름 > ");
			String company = getString();
			System.out.print("거래품목 > ");
			String product = getString();
			System.out.print("직급 > ");
			String manager = getString();

			contact = new CustomerContact(name, phoneNumber, email, address, birthday, group, company, product,
					manager);

		}

		contacts.add(contact);

	}

	// 2. 연락처 검색
	void searchContact() {

		String name = null;
		System.out.println("검색을 시작합니다.");
		System.out.println("검색할 이름을 입력하세요. >");

		int searchIndex = getIndex();
		
		Contact contact = null;
		
		System.out.println("=====검색 결과=====");
		if (searchIndex<0) {
			System.out.println("검색한 이름 " + name + "의 정보가 없습니다. ");
		} else {
			contacts.get(searchIndex).printContact();
		}

	}

	// 3. 연락처 수정 (이름 검색 후 연락처 수정, 중복 이름 없다고 가정)
	void editContact() {

		System.out.println("데이터 수정이 진행됩니다. ");
		System.out.println("수정하고자 하는 이름을 입력해주세요. > ");
		
		String name = null;
		int searchIndex = getIndex();

		if (searchIndex < 0) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}
		
		Contact contact = contacts.get(searchIndex);

		System.out.println("데이터 수정을 진행합니다. ");
		System.out.println("변경하고자하는 이름을 입력해 주세요. (현재값 : " + contact.getName() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newName = getName();

		// trim-> 공백제거 // 사용자가 공백만 잘못치는 것 방지 등을 위해 사용하였음
		if (newName != null && newName.trim().length() > 0) {
			contact.setName(newName);
		}

		System.out.println("변경하고자하는 전화번호를 입력해 주세요. (현재값 : " + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newPhoneNumber = getPhoneNumber();

		if (newPhoneNumber != null && newPhoneNumber.trim().length() > 0) {
			contact.setPhoneNumber(newPhoneNumber);
		}

		System.out.println("변경하고자하는 이메일를 입력해 주세요. (현재값 : " + contact.getEmail() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newEmail = sc.nextLine();

		if (newEmail != null && newEmail.trim().length() > 0) {
			contact.setEmail(newEmail);
		}

		System.out.println("변경하고자하는 주소를 입력해 주세요. (현재값 : " + contact.getAddress() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newAddress = sc.nextLine();

		if (newAddress != null && newAddress.trim().length() > 0) {
			contact.setAddress(newAddress);
		}

		System.out.println("변경하고자하는 생일을 입력해 주세요. (현재값 : " + contact.getBirthday() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newBirthday = sc.nextLine();

		if (newBirthday != null && newBirthday.trim().length() > 0) {
			contact.setBirthday(newBirthday);
		}

		System.out.println("변경하고자하는 그룹을 입력해 주세요. (현재값 : " + contact.getGroup() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
		String newGroup = sc.nextLine();

		if (newGroup != null && newGroup.trim().length() > 0) {
			contact.setGroup(newGroup);
		}

		if (contact instanceof CompanyContact) {

			CompanyContact companyContact = (CompanyContact) contact;

			System.out.println(
					"변경하고자 하는 회사이름을 입력해 주세요.(현재값 : " + companyContact.getCompany() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newCompany = sc.nextLine();
			if (newCompany != null && newCompany.trim().length() > 0) {
				companyContact.setCompany(newCompany);
			}

			System.out.println(
					"변경하고자 하는 부서이름을 입력해 주세요.(현재값 : " + companyContact.getDivision() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newDivision = sc.nextLine();
			if (newDivision != null && newDivision.trim().length() > 0) {
				companyContact.setDivision(newDivision);
			}

			System.out.println(
					"변경하고자 하는 직급을 입력해 주세요.(현재값 : " + companyContact.getManager() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newManager = sc.nextLine();
			if (newManager != null && newManager.trim().length() > 0) {
				companyContact.setManager(newManager);
			}
		}

		if (contact instanceof CustomerContact) {

			CustomerContact customerContact = (CustomerContact) contact;

			System.out.println(
					"변경하고자 하는 거래처이름을 입력해 주세요.(현재값 : " + customerContact.getCompany() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newCompany = sc.nextLine();
			if (newCompany != null && newCompany.trim().length() > 0) {
				customerContact.setCompany(newCompany);
			}

			System.out.println(
					"변경하고자 하는 품목을 입력해 주세요.(현재값 : " + customerContact.getProduct() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newProduct = sc.nextLine();
			if (newProduct != null && newProduct.trim().length() > 0) {
				customerContact.setProduct(newProduct);
			}

			System.out.println(
					"변경하고자 하는 직급을 입력해 주세요.(현재값 : " + customerContact.getManager() + ")\n" + "변경하지 않으려면, 엔터를 치세요. >");
			String newManager = sc.nextLine();
			if (newManager != null && newManager.trim().length() > 0) {
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
		String name = null;
		int searchIndex = getIndex();

		if (searchIndex < 0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 존재하지 않습니다. ");
		} else {
			contacts.remove(searchIndex);
			System.out.println("데이터가 삭제되었습니다. ");
		}

	}

	// 5. 연락처 전체 출력
	void printAllData() {

		System.out.println("----전체 데이터를 출력합니다----");

		if (contacts.isEmpty()) {
			System.out.println("입력된 정보가 없습니다. ");
			return;
		}

		for (int i = 0; i < contacts.size(); i++) {
			contacts.get(i).printContact();
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

	// name 을 입력받고 같은 name 이 있는지 index 반환하는 메소드  
	private int getIndex() {
		
		String name = sc.nextLine();
		int searchIndex = -1;
		for(int i=0; i<contacts.size(); i++) {
			if(contacts.get(i).getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
	}
	
	// 입력 또는 수정할 때 공백 문자열을 입력 받으면 다시 입력 받도록 흐름을 만들어봅시다.
	// 공백일 경우 다시 입력받도록 하는 메소드
	// private 쓴 이유 -> SmartPhone 에서만 쓰일 거라서..
	private String getString() {
		String str;
		while (true) {
			str = sc.nextLine();
			if (str != null && str.trim().length() != 0) {
				break;
			} else {
				System.out.println("공백이 아닌 문자를 입력해주세요. ");
			}
		}
		return str;
	}

	// 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다
	// 영문자와 한글만 입력하고 공백일 경우 다시 입력받도록 하는 메소드 
	private String getName() {
		String name = null;
		while (true) {

			try {
				name = sc.nextLine();
				boolean chk1 = Pattern.matches("^[a-zA-z가-힣]*$", name); // 영문자한글
				boolean chk2 = name.isBlank(); // 공백
				if (!chk1 || chk2) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("영문자, 한글만 입력 가능합니다. 다시 입력해주세요. ");
			}
			continue;
		}
		return name;
	}

	// 입력할 때 전화번호가 같은 데이터가 입력되면 입력이 되지 않도록 흐름을 만들어봅시다.
//	private String getPhoneNumber() {
//		String phoneNumber;
//		while(true) {
//			phoneNumber = sc.nextLine();
//				// 공백 체크 
//			if(phoneNumber!=null && phoneNumber.trim().length()!=0) {
//				//전화번호 중복 여부 체크
//				boolean check = false;
//				for(int i=0; i<numOfContact; i++) {
//					if(phoneNumber.equals(contacts[i].getPhoneNumber())) {
//						check = true;
//						break;
//					}
//				}
//				if(check) {
//					System.out.println("중복된 전화번호가 존재합니다. 다시 입력해주세요.");
//				} else {
//					break;
//				}
//			} else {
//				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력하세요.");
//			}
//		}
//		return phoneNumber;
//	}

	// 전화번호 형식에 맞지 않을 때 예외처리를 하고, 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다
	// 숫자만 입력하고 공백이거나 중복일 경우 다시 입력하도록 하는 메소드 
	private String getPhoneNumber() {
		String phoneNumber = null;
		while (true) {
			try {
				phoneNumber = sc.nextLine();
				boolean chk1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}+$", phoneNumber); // 입력 형식 nnn-nnnn-nnnn
				boolean chk2 = phoneNumber.isBlank(); // 공백체크
				boolean chk3 = false; // 중복체크 
				
				for(int i=0; i<contacts.size(); i++) {
					if(phoneNumber.equals(contacts.get(i).getPhoneNumber())) {
						chk3 = true;
						break;
					}
				}
				
				if(chk3) {
					System.out.println("중복된 전화번호가 존재합니다. 다시 입력해주세요.");
				} else if(!chk1 || chk2) {
					throw new Exception();
				} else {
					break;
				}
			} catch(Exception e) {
				System.out.println("000-0000-0000 숫자 형식에 맞게 입력해주세요. ");
			}
		}	
		return phoneNumber;
	}
	
	
	
	
}