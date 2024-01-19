import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car(0,"yamaha", 200F);

    @Test
    @DisplayName("getHourCost")
    void getHourCost() {
        assertEquals(200, car.getHourCost());
    }

    @Test
    @DisplayName("getId")
    void getId() {
        assertEquals(0, car.getId());
    }

    @Test
    @DisplayName("getModel")
    void getModel() {
        assertEquals("yamaha", car.getModel());
    }

}