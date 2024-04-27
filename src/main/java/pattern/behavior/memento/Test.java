package pattern.behavior.memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("a");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("b");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
