import java.util.Date;

// Booking Class
class Booking {
    private int bookingID;
    private Date startTime;
    private Date endTime;
    private BookingStatus status;

    public void confirmBooking() {
        System.out.println("Confirming booking with bookingID: " + bookingID);
    }

    public void cancelBooking() {
        System.out.println("Cancelling booking with bookingID: " + bookingID);
    }

    public void checkStatus() {
        System.out.println("Booking status: " + status);
    }
}

// Enum for BookingStatus
enum BookingStatus {
    REQUESTED, CONFIRMED, IN_USE, COMPLETED, CANCELLED;
}