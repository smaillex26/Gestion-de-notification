package notification;

public class SMSNotification extends Notification{

    public SMSNotification(){}

    @Override
    public void sendWithStrategy(String message) {
//        System.out.println("SMS to " + message);
        this.strategy.send("SMS to " + message);
    }


}
