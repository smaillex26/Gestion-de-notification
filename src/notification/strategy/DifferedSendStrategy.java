package notification.strategy;

public class DifferedSendStrategy implements SendStrategy {
    @Override
    public void send(String message){
        System.out.println(message + " [Différé]");
    }
}