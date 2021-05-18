package library;

public class Member {
	private final String memberId;
	private final String memberName;
	private final String memberType;
	private final int entitlement;
	private final String address;
	private final String emailId;
	
	
	public Member(String memberId, String memberName, String memberType, int entitlement, String address,
			String emailId) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberType = memberType;
		this.entitlement = entitlement;
		this.address = address;
		this.emailId = emailId;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberType() {
		return memberType;
	}
	public int getEntitlement() {
		return entitlement;
	}
	public String getAddress() {
		return address;
	}
	public String getEmailId() {
		return emailId;
	}
	public String toString(){
		return memberId + " " + memberName;
	}
}
	


