public class Main {
    public static void main(String[] args) {
        System.out.println("=== Initializing System ===");

        // 创建分支经理和通知系统
        BranchManager manager = new BranchManager(1, "Edward");
        Notification notification = new Notification();

        // 创建 ITSupport、CleaningStaff 和 Receptionist 对象
        ITSupport itSupport = new ITSupport(1001, "Alice", "Network Security");
        CleaningStaff cleaningStaff = new CleaningStaff(1002, "Bob", "Night");
        Receptionist receptionist = new Receptionist(1003, "Cathy", "English, Spanish");

        // 打印员工信息
        System.out.println("\n=== Employee Details ===");
        itSupport.displayInfo();
        cleaningStaff.displayInfo();
        receptionist.displayInfo();

        // 分支经理更新班次并发送通知
        System.out.println("\n=== Updating Shift Schedules ===");
        manager.updateShiftSchedule(cleaningStaff, "Morning Shift", notification);
        manager.updateShiftSchedule(itSupport, "Night Shift", notification);

        // 创建会员对象
        Member member1 = new Member(2001, "John Doe", "Premium");
        Member member2 = new Member(2002, "Jane Smith", "Basic");

        // 打印会员信息
        System.out.println("\n=== Member Details ===");
        System.out.println("Member ID: " + member1.getMemberID() + ", Name: " + member1.getName() + ", Membership Type: " + member1.getMembershipType());
        System.out.println("Member ID: " + member2.getMemberID() + ", Name: " + member2.getName() + ", Membership Type: " + member2.getMembershipType());

        // 创建空间对象并检查可用性
        Space conferenceRoom = new Space("Conference Room A", true);
        Space privateOffice = new Space("Private Office B", false);

        System.out.println("\n=== Space Availability ===");
        System.out.println("Space: " + conferenceRoom.getSpaceName() + ", Available: " + conferenceRoom.checkAvailability());
        System.out.println("Space: " + privateOffice.getSpaceName() + ", Available: " + privateOffice.checkAvailability());

        // 会员预订会议室
        System.out.println("\n=== Space Booking ===");
        if (conferenceRoom.checkAvailability()) {
            Booking booking1 = new Booking(101, member1, conferenceRoom.getSpaceName(), "2024-11-20 10:00 AM");
            booking1.confirmBooking();
            notification.sendBookingConfirmation(member1, booking1.getSpaceName() + " at " + booking1.getBookingTime());
        } else {
            System.out.println("Conference Room A is not available for booking.");
        }

        // 会员尝试预订不可用的办公室
        if (privateOffice.checkAvailability()) {
            Booking booking2 = new Booking(102, member2, privateOffice.getSpaceName(), "2024-11-20 2:00 PM");
            booking2.confirmBooking();
            notification.sendBookingConfirmation(member2, booking2.getSpaceName() + " at " + booking2.getBookingTime());
        } else {
            System.out.println("Private Office B is not available for booking.");
        }

        // 创建班次管理对象并保存班次
        System.out.println("\n=== Shift Schedule Management ===");
        ShiftSchedule shiftSchedule = new ShiftSchedule();
        shiftSchedule.saveSchedule("Morning Shift: 9 AM - 5 PM for Cleaning Staff");
        shiftSchedule.saveSchedule("Night Shift: 6 PM - 2 AM for IT Support");

        // 打印最终摘要
        System.out.println("\n=== Summary ===");
        System.out.println("Updated Cleaning Staff Info:");
        cleaningStaff.displayInfo();
        System.out.println("Updated IT Support Info:");
        itSupport.displayInfo();
    }
}
