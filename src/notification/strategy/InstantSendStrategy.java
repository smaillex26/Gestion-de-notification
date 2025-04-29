package notification.strategy;

public class InstantSendStrategy implements SendStrategy {
    @Override
    public void send(String message) {
        System.out.println(message + " [instantané]");
    }
}
