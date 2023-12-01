import java.sql.Date;

public class Admin implements User {
    Request request;
    String name;

    public Admin(Request request, String name) {
        this.request = request;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeRequest(Date date, Integer requestType, String option) {
        request.rentCar(this, option, date);
        return null;
    }
}
