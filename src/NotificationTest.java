import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationTest {

    @Test
    void testTriggerShiftUpdateNotification() {
        Employee employee = new Employee(1001, "Alice", "IT Support");
        Notification notification = new Notification();
        // 手动验证输出是否符合预期
        notification.triggerShiftUpdateNotification(employee);
    }

    @Test
    void testSendBookingConfirmation() {
        Member member = new Member(2001, "John Doe", "Premium");
        Notification notification = new Notification();
        // 手动验证输出是否符合预期
        notification.sendBookingConfirmation(member, "Conference Room A at 10:00 AM");
    }
}
