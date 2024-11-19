import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void testConfirmBooking() {
        Member member = new Member(2001, "John Doe", "Premium");
        Booking booking = new Booking(101, member, "Conference Room A", "2024-11-20 10:00 AM");

        booking.confirmBooking();
        assertEquals("Confirmed", booking.getStatus());
    }

    @Test
    void testBookingDetails() {
        Member member = new Member(2001, "John Doe", "Premium");
        Booking booking = new Booking(101, member, "Conference Room A", "2024-11-20 10:00 AM");

        assertEquals("Conference Room A", booking.getSpaceName());
        assertEquals("2024-11-20 10:00 AM", booking.getBookingTime());
        assertEquals("Pending", booking.getStatus());
    }
}
