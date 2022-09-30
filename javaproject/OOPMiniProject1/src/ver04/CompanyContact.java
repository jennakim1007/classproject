package ver04;

public class CompanyContact extends Contact {

	/*
	 * CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다
	 * - 회사이름, 부서이름, 직급 변수 추가
	 * - 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
	 */
	
	private String company;
	private String division;
	private String manager;
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String division, String manager) {
		super(name, phoneNumber, email, address, birthday, group);
		
		this.company = company;
		this.division = division;
		this.manager = manager;
	}
		
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public void showContact() {
		super.showContact();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서이름 : " + this.division);
		System.out.println("직급 : " + this.manager);
	}
	
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	// 테스트
	public static void main(String[] args) {
		
		Contact contact = new CompanyContact("김당근", "010-8282-8282", "bana@gamil.com", "친구", "20021010", "토끼", "당근나라", "회계", "없음");
		contact.showContact();
		
	}


	
	
	
	
}
