public class RentCarRequestFactory implements RequestFactory{

    @Override
    public Request createRequest() {
        return new RentCarRequest();
    }
}
