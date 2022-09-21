package chapter06;

public class Member {

	// 변수 선언
	private int memberNo;
	private String memberId;
	private String memberName;

	// 생성자
	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// get 메소드만 사용함 -> 읽기전용이 된다.
	public int getMemberNo() {
		return memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberName=" + memberName + "]";
	} // 특정 문자 패턴을 정리해놓고 출력되도록 수정하여도 된다.

	public static void main(String[] args) {

		// 회원 5명의 정보를 저장할 수 있는 배열을 만들자
		Member[] members = new Member[5]; // Member[] members 참조변수

		// 각 배열의 요소에 초기화
		members[0] = new Member(1, "cool", "COOL"); // 참조변수
		members[1] = new Member(2, "hot", "HOT");
		members[2] = new Member(3, "son", "SON");
		members[3] = new Member(4, "park", "PARK");
		members[4] = new Member(5, "cha", "CHA");

		// 위 배열을 이용해서 각 개체의 값을 참조하여 출력
		for (int i = 0; i < members.length; i++) {
			System.out.printf("%d번 회원의 아이디는 %s이고, 이름은 %s이다. \n", members[i].getMemberNo(), members[i].getMemberId(),
					members[i].getMemberName());
		}

		// sp2 = sp1
		for (Member member : members) {
			System.out.println(member); // member.toString()
		}

	}

}
