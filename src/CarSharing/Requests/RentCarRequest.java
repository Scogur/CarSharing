package CarSharing.Requests;

import CarSharing.User;

import java.text.MessageFormat;
import java.time.LocalDateTime;

public class RentCarRequest implements Request{
    @Override
    public void rentCar(User user, String carModel, LocalDateTime date) {
        System.out.println(MessageFormat.format("{0} CarSharing.User: {1} CarSharing.Car model: {2}",date, user, carModel));
    }
}
