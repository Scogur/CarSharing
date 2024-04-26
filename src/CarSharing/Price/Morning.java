package CarSharing.Price;

public class Morning extends TimeOfDay{
    public Morning() {
        this.priceStrat = new MorningStrategy();
    }
}
