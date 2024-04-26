package CarSharing.MapContent;

import java.util.HashMap;

public class ObjectsFactory {
    private static HashMap<MapObject.OType, MapObject> objectsCache = new HashMap<>();

    public static MapObject createObject(MapObject.OType type){
        return objectsCache.computeIfAbsent(type, newType ->{
            boolean IsOpen24h = true;
            return new ConvenienceStore(newType, IsOpen24h);
        });
    }
}
