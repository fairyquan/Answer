package pattern.behavior.mediator;

public interface Mediator {
    void send(Renter renter,String msg);
    void send(Saler saler,String msg);
    void addSaler(Saler saler);
    void addRenter(Renter renter);
}
