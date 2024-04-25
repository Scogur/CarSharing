package CarSharing;

import java.time.LocalDateTime;

public interface User {
    public void makeRequest(LocalDateTime date, Integer requestType, String option);

    public  void sendMessage(String message);

    public void recieveMessage(String message);
}
