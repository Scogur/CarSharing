package CarSharing.Login;

import java.util.Objects;

public class DialogProxy implements Mediator{

    @Override
    public void login() {
        String[] data = getData();
        if (checkEmpty(data)) {
            Dialog dialog = new Dialog();
            dialog.login(data);
        }
    }
    private boolean checkEmpty(String[] data){
        return (data[0].isBlank()) | (data[1].isBlank());
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
