import java.sql.Date;
import java.time.LocalDateTime;

public interface User {
    public void makeRequest(LocalDateTime date, Integer requestType, String option);
}
