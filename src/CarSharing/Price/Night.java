package CarSharing.Price;

public class Night extends TimeOfDay{
    public Night() {
        this.priceStrat = new NightStrategy();
    }
}
