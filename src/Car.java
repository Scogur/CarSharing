public class Car {
    Integer id;
    String model;

    Float hourCost;

    public Car(Integer id, String model) {
        this.id = id;
        this.model = model;
    }
    public Car(Integer id, String model, Float hourCost){
        this.id = id;
        this.model = model;
        this.hourCost = hourCost;
    }

    public Float getHourCost(){
        return hourCost;
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

    public void setHourCost(Float hourCost){
        this.hourCost = hourCost;
    }
}
