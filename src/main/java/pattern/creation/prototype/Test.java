package pattern.creation.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("a",1,"white");
        Room room=new Room("room1",01);
        sheep.setRoom(room);

        Sheep clone = sheep.clone();
        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();

        System.out.println(sheep+"----"+sheep.getRoom().hashCode());
        System.out.println(clone+"----"+clone.getRoom().hashCode());
        System.out.println(clone1+"----"+clone1.getRoom().hashCode());
        System.out.println(clone2+"----"+clone2.getRoom().hashCode());
    }
}
