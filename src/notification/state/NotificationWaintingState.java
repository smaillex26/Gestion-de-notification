package notification.state;

public class NotificationWaintingState implements NotificationState{
    @Override
    public NotificationState switchToWaitingState() {
        System.out.println("notification.Notification en attente ...");
        return this;

    }

    @Override
    public NotificationState switchToFailedState() {
        System.out.println("Échec de l'envoi de la notification.");
        return new NotificationFailedState();

    }

    @Override
    public NotificationState switchToReadedState() throws Exception {
        throw new Exception("Échec de l'envoi de la notification.");
    }

    @Override
    public NotificationState switchToSentState() {
        System.out.println("notification.Notification envoyée.");
        return new NotificationSentState();
    }
}
