public class Booking {
    private int bookingID;
    private Member member;
    private String spaceName;
    private String bookingTime;
    private String status;

    public Booking(int bookingID, Member member, String spaceName, String bookingTime) {
        this.bookingID = bookingID;
        this.member = member;
        this.spaceName = spaceName;
        this.bookingTime = bookingTime;
        this.status = "Pending";
    }

    public void confirmBooking() {
        this.status = "Confirmed";
        System.out.println("Booking confirmed for " + spaceName + " at " + bookingTime);
    }

    public String getSpaceName() {
        return spaceName;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public String getStatus() {
        return status;
    }
}
