package notification;

import notification.state.NotificationState;
import notification.strategy.CryptedSendStrategy;
import notification.strategy.DifferedSendStrategy;
import notification.strategy.InstantSendStrategy;
import notification.strategy.SendStrategy;

public abstract class Notification {
    public SendStrategy strategy;
    public abstract void sendWithStrategy(String message);
    private NotificationState state;

    public void setStrategy(String way)
    {
        this.strategy = switch(way) {
            case "instant" -> new InstantSendStrategy();
            case "crypted" -> new CryptedSendStrategy();
            case "differed" -> new DifferedSendStrategy();
            default -> new InstantSendStrategy();
        };
    }
}
