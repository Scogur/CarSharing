package CarSharing.Requests;

import CarSharing.User;

import java.time.LocalDateTime;

public interface Request {
    public void rentCar(User user, String carModel, LocalDateTime date);
}
