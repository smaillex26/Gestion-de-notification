package notification.strategy;

public class CryptedSendStrategy implements SendStrategy {
    @Override
    public void send(String message){
        System.out.println(message + " [Crypté]");
    }
}