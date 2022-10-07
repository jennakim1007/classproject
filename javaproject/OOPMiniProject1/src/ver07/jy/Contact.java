package ver07.jy;

// Contact클래스가 ShowData인터페이스를 상속하면서 추상 메소드를 보유하는 관계로 생성
// Contact클래스는 추상 메소드를 가지고 있어 추상클래스가 되는 형태로 정의
public abstract class Contact implements ShowData {
	
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
	
	public Contact() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	@Override
	public void showData() {
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}
	
	public void printContact() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : " + this.group);
	}


}
