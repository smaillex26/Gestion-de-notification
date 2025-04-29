import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User alice = new User("Alice", Arrays.asList("Email", "SMS"));
        User bob = new User("Bob", Arrays.asList("Push"));

        NotificationManager manager = NotificationManager.getInstance();
        manager.subscribe(alice);
        manager.subscribe(bob);

        manager.notifyAllObservers("Nouvelle fonctionnalité disponible", "crypted");
        manager.notifyAllObservers("Nouvelle fonctionnalité disponible demain", "differed");
    }
}
