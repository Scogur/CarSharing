package CarSharing.Login;

public class Dialog implements Mediator{
    @Override
    public void login() {
        System.out.println("Email");
        String email = System.console().readLine();
        System.out.println("Password");
        String password = System.console().readLine();
        System.out.println("Logging in");
        //logging in
    }
}
