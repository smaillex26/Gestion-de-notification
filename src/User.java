import notification.Notification;
import notification.NotificationFactory;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer{
    private final String name;
    private List<Notification> preferredNotifications;
    private List<Notification> notifications;

    public User(String name, List<String> types)
    {
        this.preferredNotifications = new ArrayList<>();
        NotificationFactory nf = new NotificationFactory();

        this.name = name;
        for(String t : types)
            this.preferredNotifications.add(nf.createNotification(t));
    }

    @Override
    public void update(String message, String way) {
        for(Notification n : this.preferredNotifications) {
            n.setStrategy(way);
            n.sendWithStrategy(this.name + " : " + message);
        }
    }
}
