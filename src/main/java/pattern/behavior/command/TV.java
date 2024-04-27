package pattern.behavior.command;

public class TV {
    private int volume;
 
    public void turnOn() {
        System.out.println("TV turned on");
    }
 
    public void turnOff() {
        System.out.println("TV turned off");
    }
 
    public void volumeUp() {
        volume++;
        System.out.println("Volume up: " + volume);
    }
 
    public void volumeDown() {
        volume--;
        System.out.println("Volume down: " + volume);
    }
}