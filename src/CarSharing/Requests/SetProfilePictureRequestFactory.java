package CarSharing.Requests;

public class SetProfilePictureRequestFactory implements RequestFactory {
    @Override
    public Request createRequest() {
        return new SetProfilePictureRequest();
    }
}
