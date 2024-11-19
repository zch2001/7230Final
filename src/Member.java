public class Member {
    private int memberID;
    private String name;
    private String membershipType;

    public Member(int memberID, String name, String membershipType) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getMemberID() {
        return memberID;
    }
}
