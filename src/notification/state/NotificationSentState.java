package notification.state;

public class NotificationSentState implements NotificationState{
    @Override
    public NotificationState switchToWaitingState() throws Exception {
        throw new Exception("Impossible");
    }

    @Override
    public NotificationState switchToFailedState() throws Exception {
        throw new Exception("Impossible");
    }

    @Override
    public NotificationState switchToReadedState() {
        return new NotificationReadState();
    }

    @Override
    public NotificationState switchToSentState() throws Exception {
        throw new Exception("Impossible");
    }
}
