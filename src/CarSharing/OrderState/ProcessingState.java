package CarSharing.OrderState;

public class ProcessingState implements State{
    @Override
    public void setState() {
        System.out.println("Processing");
    }
}
