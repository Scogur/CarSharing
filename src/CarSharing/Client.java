package CarSharing;

import CarSharing.Requests.RentCarRequestFactory;
import CarSharing.Requests.Request;
import CarSharing.Requests.RequestFactory;

import java.time.LocalDateTime;

public class Client implements User{
    Request request;
    String name;
    Integer id;

    Chat chat;

    public Client(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeRequest(LocalDateTime date, Integer requestType, String option) {
        User user = this;
        if(requestType==1) {
            RequestFactory requestFactory = requestByType(requestType);
            request = requestFactory.createRequest();
            //request.rentCar(this, option, date);
        }
    }

    public RequestFactory requestByType(Integer requestType){
        if (requestType == 1){
            return new RentCarRequestFactory();
        }
        else return null;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println(this.id+" recieve "+message );
    }
}
