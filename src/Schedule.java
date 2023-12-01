import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Schedule {
    HashMap<Integer, Date> sked = new HashMap<>();
    private static Schedule instance;

    public static synchronized Schedule getInstance() {
        if (instance == null) {
            instance = new Schedule();
        }
        return instance;
    }

    public boolean isFree (int carId) {

        return true;
    }

    public int getCarIdByModel(String carModel){

        return 0;
    }

    public int findFreeCar(){
        return 0;
    }

    public void rentCar(int carId, Date date){

    }

    public HashMap<Integer,Date> getSked() {
        return sked;
    }
}
