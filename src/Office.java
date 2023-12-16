import java.util.ArrayList;
public class Office {
    ArrayList<Integer> adminIds = new ArrayList<>();
    private static Office instance;

    public static synchronized Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public void addAdmin(int id) {
        adminIds.add(id);
    }

    public ArrayList<Integer> getAdminIds() {
        return adminIds;
    }
}
