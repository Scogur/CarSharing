package CarSharing;

import java.util.List;

public class SupportChat implements Chat {
    List<User> users;
    @Override
    public void sendMessage(String message, User user) {
        for(User u: users){
                u.recieveMessage(message);
        }
    }

    public void addChatUser(User user){
        this.users.add(user);
    }

    @Override
    public void recieveMessage(String message, User user) {

    }
}
