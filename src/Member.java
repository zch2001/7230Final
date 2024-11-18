import java.util.Date;
import java.util.List;

// Member Class
class Member {
    private int memberID;
    private String name;
    private MembershipType membershipType;
    private String billingInfo;
    private List<String> usageHistory;

    public void bookSpace(int spaceID, Date date) {
        System.out.println("Member booking space with spaceID: " + spaceID);
    }

    public void registerForEvent(int eventID) {
        System.out.println("Registering member for event with eventID: " + eventID);
    }

    public void submitFeedback(int branchID, int rating, String comments) {
        System.out.println("Submitting feedback for branch with branchID: " + branchID);
    }

    public void viewInvoice() {
        System.out.println("Viewing invoice for member: " + name);
    }

    public void renewMembership() {
        System.out.println("Renewing membership for member: " + name);
    }
}

// Enum for MembershipType
enum MembershipType {
    DAILY, WEEKLY, MONTHLY;
}