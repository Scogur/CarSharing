import java.time.LocalDateTime;
import java.util.HashMap;

public class Schedule {
    private static Schedule schedule;
    public static synchronized Schedule getSchedule(){
        if(schedule == null){
            schedule = new Schedule();
        }
        return schedule;
    }
    HashMap<Integer, LocalDateTime> sked = new HashMap<>();
    HashMap<Integer, String> cars = new HashMap<>();
    private static Schedule instance;

    public static synchronized Schedule getInstance() {
        if (instance == null) {
            instance = new Schedule();
        }
        return instance;
    }
    public HashMap<Integer, String> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.put(car.getId(), car.getModel());
    }
    public boolean isFree (int carId) {

        return true;
    }
    public int getCarIdByModel(String carModel){

        return 0;
    }
    public int findFreeCar(String carModel){
        return 0;
    }
    public void rentCar(int carId, LocalDateTime date){

    }
    public HashMap<Integer,LocalDateTime> getSked() {
        return sked;
    }
}
