package CarSharing;

public interface Chat {
    public void sendMessage(String message, User user);

    public void recieveMessage(String message, User user);
}
