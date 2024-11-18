import java.util.Date;

// Space Class
class Space {
    private int spaceID;
    private String type;
    private int capacity;
    private boolean availability;

    public void bookSpace(int memberID, Date dateTime) {
        System.out.println("Booking space for memberID: " + memberID);
    }

    public void cancelBooking(int bookingID) {
        System.out.println("Cancelling booking with ID: " + bookingID);
    }

    public boolean checkAvailability(Date date) {
        System.out.println("Checking availability for date: " + date);
        return availability;
    }

    public int getCapacity() {
        return capacity;
    }
}