package notification;

public class PushNotification extends Notification{

    public PushNotification(){}

    @Override
    public void sendWithStrategy(String message) {
        this.strategy.send("Push to " + message);
    }
}
