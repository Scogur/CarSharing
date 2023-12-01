import java.sql.Date;

public interface Request {
    public void rentCar(User user, String carModel, Date date);
}
