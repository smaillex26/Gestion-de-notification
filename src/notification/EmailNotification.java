package notification;

public class EmailNotification extends Notification{

    public EmailNotification(){}

    @Override
    public void sendWithStrategy(String message) {
        this.strategy.send("Email to " + message);
    }
}







