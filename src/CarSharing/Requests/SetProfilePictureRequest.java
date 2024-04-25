package CarSharing.Requests;

import CarSharing.User;

import java.io.File;
import java.text.MessageFormat;
import java.time.LocalDateTime;

public class SetProfilePictureRequest implements Request {
    public void setPicture(User user, File file, LocalDateTime date) {
        System.out.println(MessageFormat.format("{0} User: {1} file name: {2}",date, user, file.getName()));
    }
}
