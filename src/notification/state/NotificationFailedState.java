package notification.state;

public class NotificationFailedState implements NotificationState{
    @Override
    public NotificationState switchToWaitingState() throws Exception {
        throw new Exception("Impossible");
    }

    @Override
    public NotificationState switchToFailedState() throws Exception {
        throw new Exception("Impossible");
    }

    @Override
    public NotificationState switchToReadedState() throws Exception {
        throw new Exception("Impossible");
    }

    @Override
    public NotificationState switchToSentState() throws Exception {
        throw new Exception("Impossible");
    }
}
