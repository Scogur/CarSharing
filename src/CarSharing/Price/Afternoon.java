package CarSharing.Price;

public class Afternoon extends TimeOfDay {
    public Afternoon() {
        this.priceStrat = new AfternoonStrategy();
    }
}
