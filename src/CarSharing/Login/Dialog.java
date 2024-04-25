package CarSharing.Login;

public class Dialog implements Mediator{

    public void login(String[] data) {

        System.out.println("Logging in");

        //logging in
    }

    @Override
    public void login() {
        getData();
        System.out.println("Logging in");

        //logging in
    }

    @Override
    public String[] getData() {
        System.out.println("Email");
        String email = System.console().readLine();
        System.out.println("Password");
        String password = System.console().readLine();
        return new String[] {email, password};
    }
}
