package pattern.behavior.mediator;

abstract class User {
    protected Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
