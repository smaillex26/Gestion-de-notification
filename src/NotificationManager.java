import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    private static NotificationManager instance;
    private static List<Observer> subscribers;

    private NotificationManager(){}

    public static NotificationManager getInstance() {
        if(instance == null)
        {
            subscribers = new ArrayList<>();
            return new NotificationManager();
        }

        return instance;
    }

    public void notifyAllObservers(String message, String strategy)
    {
        for(Observer o : subscribers) o.update(message,  strategy);
    }

    public void subscribe(Observer o)
    {
        subscribers.add(o);


    }
}
