package CarSharing.MapContent;

public class ConvenienceStore implements MapObject{
    private OType type;
    private Boolean Is24h;

    public ConvenienceStore(OType type, Boolean is24h) {
        this.type = type;
        Is24h = is24h;
    }

    @Override
    public void checkIsOpen() {

    }

    @Override
    public OType getType() {
        return this.type;
    }
}
