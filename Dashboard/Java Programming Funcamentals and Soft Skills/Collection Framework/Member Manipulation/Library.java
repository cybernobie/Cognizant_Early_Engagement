import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Member> memberList = new ArrayList<>();

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public List<Member> viewAllMembers() {
        return memberList;
    }

    public List<Member> viewMembersByAddress(String address) {
        return memberList.stream().filter(member -> member.getAddress().contains(address)).collect(Collectors.toList());
    }
}
