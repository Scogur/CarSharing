package CarSharing;

public class ProgramRunner {
    public static void main(String[] args){
        /*CarSharing.Car car1 = new CarSharing.Car(1,"Mitsubishi");
        CarSharing.Car car2 = new CarSharing.Car(2,"Toyota");
        CarSharing.Schedule.getSchedule().addCar(car1);
        CarSharing.Schedule.getSchedule().addCar(car2);
        System.out.println(CarSharing.Schedule.getSchedule().getCars());
        CarSharing.Office office_1 = new CarSharing.Office();
        office_1.addAdmin(1);
        office_1.addAdmin(2);
        office_1.addAdmin(3);
        System.out.println(office_1.getAdminIds());
        CarSharing.Office office_2 = new CarSharing.Office();
        office_2.addAdmin(4);
        office_2.addAdmin(5);
        office_2.addAdmin(6);
        System.out.println(office_2.getAdminIds());*/
        Client client_1 = new Client("Client1", 7);
        Client client_2 = new Client("Client2", 8);
        Client client_3 = new Client("Client3", 9);
        /*System.out.println(MessageFormat.format("Making request at time:{0} with request type: {1}, option: {2}", LocalDateTime.now(), 1, "Toyota"));
        client_1.makeRequest(LocalDateTime.now(), 1, "Toyota");*/
        SupportChat chat1 = new SupportChat();
        chat1.addChatUser(client_1);
        chat1.addChatUser(client_2);
        chat1.addChatUser(client_3);
        client_1.sendMessage("Message");
    }
}
