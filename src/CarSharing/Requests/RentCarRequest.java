package CarSharing.Requests;

import CarSharing.User;

import java.text.MessageFormat;
import java.time.LocalDateTime;

public class RentCarRequest implements Request{
    public void rentCar(User user, String carModel, LocalDateTime date) {
        System.out.println(MessageFormat.format("{0} User: {1} Car model: {2}",date, user, carModel));
    }
}
