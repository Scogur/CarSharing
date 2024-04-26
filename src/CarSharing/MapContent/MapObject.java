package CarSharing.MapContent;

public interface MapObject {
    enum OType{
        shop,
        gasStation,
        parking,
    }
    public void checkIsOpen();
    public OType getType();
}
