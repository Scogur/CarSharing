public class Car {
    Integer id;
    String model;

    public Car(Integer id, String model) {
        this.id = id;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
