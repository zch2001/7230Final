public class Notification {
    public void triggerShiftUpdateNotification(Employee employee) {
        System.out.println("Notification sent to Employee ID: " + employee.getEmployeeID() +
                " - Your shift schedule has been updated.");
    }

    public void sendBookingConfirmation(Member member, String bookingDetails) {
        System.out.println("Notification sent to Member: " + member.getName() +
                " - Booking confirmed: " + bookingDetails);
    }
}
