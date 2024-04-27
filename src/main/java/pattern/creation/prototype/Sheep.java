package pattern.creation.prototype;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private Room room;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        Sheep cloneSheep=(Sheep) super.clone();
        Room cloneRoom = room.clone();
        cloneSheep.setRoom(cloneRoom);
        return cloneSheep;
    }
}
