package pattern.creation.prototype;

public class Room implements Cloneable{
    private String name;
    private int roomId;

    public Room(String name, int roomId) {
        this.name = name;
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public Room clone() throws CloneNotSupportedException{
        return (Room) super.clone();
    }
}
