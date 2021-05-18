package library;

import java.util.ArrayList;

public class MemberDAO {
    ArrayList<Member> memberList =  new ArrayList<Member>();
	
	public void addMember(Member obj){
		memberList.add(obj);
	}
	
	public void removeMember(Member obj)
	{
		memberList.remove(obj);
	}
	
	public void viewMember()
	{
		for(int i=0;i<memberList.size();i++)
		{
			System.out.println("Member Id:" + memberList.get(i).getMemberId());
			System.out.println("Member Title:" + memberList.get(i).getMemberName());
			System.out.println("Member Type:" + memberList.get(i).getMemberType());
			System.out.println("Address:" + memberList.get(i).getAddress());
			System.out.println("Email-id:" + memberList.get(i).getEmailId());
			System.out.println("Entitlement:" + memberList.get(i).getEntitlement());
			
			
		}
	}

}
