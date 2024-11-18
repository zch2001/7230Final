import java.util.Date;

// Notification Class
class Notification {
    private int notificationID;
    private String message;
    private Date dateSent;
    private NotificationType type;

    public void sendNotification(int memberID) {
        System.out.println("Sending notification to memberID: " + memberID);
    }

    public void archiveNotification() {
        System.out.println("Archiving notification with ID: " + notificationID);
    }
}

// Enum for NotificationType
enum NotificationType {
    REMINDER, ALERT, UPDATE;
}