package CarSharing.OrderState;

public class OrderState {
    State currentState;
    public void SetCompleted(){
        currentState = new CompletedState();
        currentState.setState();
    }
    public void SetProcessing(){
        currentState = new ProcessingState();
        currentState.setState();
    }
    public void SetInSchedule(){
        currentState = new InScheduleState();
        currentState.setState();
    }
}
