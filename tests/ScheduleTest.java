import CarSharing.Car;
import CarSharing.Schedule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleTest {
    Car car1 = new Car(0,"yamaha");
    Car car2 = new Car(1,"toyota");
    Car car3 = new Car(2,"mitsubishi");
    HashMap<Integer, String> testMap = new HashMap<>();
    @Test
    @DisplayName("Get car")
    void getCars() {
        Schedule.getSchedule().addCar(car1);
        Schedule.getSchedule().addCar(car2);
        Schedule.getSchedule().addCar(car3);
        testMap.put(car1.getId(), car1.getModel());
        testMap.put(car2.getId(), car2.getModel());
        testMap.put(car3.getId(), car3.getModel());
        assertEquals(testMap, Schedule.getSchedule().getCars());
    }

    @Test
    @DisplayName("Add car")
    void addCar() {
        Schedule.getSchedule().addCar(car1);
        testMap.put(car1.getId(), car1.getModel());
        assertEquals(testMap, Schedule.getSchedule().getCars());
    }
}
