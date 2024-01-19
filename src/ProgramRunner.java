import java.text.MessageFormat;
import java.time.LocalDateTime;

public class ProgramRunner {
    public static void main(String[] args){
        Car car1 = new Car(1,"Mitsubishi");
        Car car2 = new Car(2,"Toyota");
        Schedule.getSchedule().addCar(car1);
        Schedule.getSchedule().addCar(car2);
        System.out.println(Schedule.getSchedule().getCars());
        Office office_1 = new Office();
        office_1.addAdmin(1);
        office_1.addAdmin(2);
        office_1.addAdmin(3);
        System.out.println(office_1.getAdminIds());
        Office office_2 = new Office();
        office_2.addAdmin(4);
        office_2.addAdmin(5);
        office_2.addAdmin(6);
        System.out.println(office_2.getAdminIds());
        Client client_1 = new Client("Client1", 7);
        System.out.println(MessageFormat.format("Making request at time:{0} with request type: {1}, option: {2}", LocalDateTime.now(), 1, "Toyota"));
        client_1.makeRequest(LocalDateTime.now(), 1, "Toyota");
    }
}
