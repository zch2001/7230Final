import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建一个分支
        Branch branch = new Branch();
        branch.generateReport(); // 测试 Branch 的方法输出

        // 创建一个空间并进行预定
        Space space = new Space();
        space.bookSpace(1, new Date()); // 测试 Space 的预定方法

        // 创建员工并更新班次
        Employee receptionist = new Receptionist();
        receptionist.updateShiftSchedule(new Schedule()); // 测试 Employee 的方法

        // 创建会员并注册活动
        Member member = new Member();
        member.registerForEvent(101); // 测试 Member 的活动注册方法

        // 创建事件并收集反馈
        Event event = new Event();
        event.collectFeedback(); // 测试 Event 的反馈收集方法

        // 创建反馈并提交
        Feedback feedback = new Feedback();
        feedback.submitFeedback(); // 测试 Feedback 的提交方法

        // 创建预定并确认
        Booking booking = new Booking();
        booking.confirmBooking(); // 测试 Booking 的确认方法

        // 创建账单并处理支付
        Billing billing = new Billing();
        billing.processPayment(); // 测试 Billing 的支付方法

        // 创建通知并发送
        Notification notification = new Notification();
        notification.sendNotification(1); // 测试 Notification 的发送方法
    }
}
