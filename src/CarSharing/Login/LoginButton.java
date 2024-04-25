package CarSharing.Login;

public class LoginButton implements Component{
    private Mediator mediator;

    public void ButtonClick(){
        mediator.login();
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
