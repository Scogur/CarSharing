package CarSharing.OrderState;

public class InScheduleState implements State{
    @Override
    public void setState() {
        System.out.println("In Schedule");
    }
}
