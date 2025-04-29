package notification;

public class NotificationFactory {
    public Notification createNotification(String type)
    {
        return switch (type) {
            case "Email" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "Push" -> new PushNotification();
            default -> null;
        };
    }
}
