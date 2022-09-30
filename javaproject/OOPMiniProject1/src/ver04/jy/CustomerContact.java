package ver04.jy;

public class CustomerContact extends Contact {
	
	// 거래처회사이름, 거래품목, 직급 추가
	private String company;
	private String product;
	private String manager;
	
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday,
			String group, String company, String product, String manager) {
		super(name, phoneNumber, email, address, birthday, group);
		this.company = company;
		this.product = product;
		this.manager = manager;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
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
		System.out.println("거래처 이름 : " + this.company);
		System.out.println("품목 : " + this.product);
		System.out.println("직급 : " + this.manager);

	}
	
}
