package notification.state;

public interface NotificationState {
    public NotificationState switchToWaitingState() throws Exception;
    public NotificationState switchToFailedState() throws Exception;
    public NotificationState switchToReadedState() throws Exception;
    public NotificationState switchToSentState() throws Exception;
}