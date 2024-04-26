package CarSharing.OrderState;

public class CompletedState implements State{
    @Override
    public void setState() {
        System.out.println("Completed");
    }
}
