package ver04.jy;

public class CompanyContact extends Contact {

	// 회사이름, 부서, 직급 추가 
	private String company;
	private String division;
	private String manager;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday,
			String group, String company, String division, String manager) {
		super(name, phoneNumber, email, address, birthday, group);
		this.company = company;
		this.division = division;
		this.manager = manager;
	}
	
	public CompanyContact() {
		
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
	
	
	// 정보를 출력하는 메소드를 오버라이딩해서 추가된 정보 추가 출력 
	@Override
	public void printContact() {
		super.printContact();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서 : " + this.division);
		System.out.println("직급 : " + this.manager);
	}

	@Override
	public void showData() {
		
	}
	
	
	

}
