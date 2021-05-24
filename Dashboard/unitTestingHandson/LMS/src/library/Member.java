package library;


public class Member {
	public String memberId;
	public String memberName;
	public String memberType;
	private final int entitlement;
	public String address;
	public String emailId;
	
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
		
		return memberId+" "+memberName;
	}
}
	


