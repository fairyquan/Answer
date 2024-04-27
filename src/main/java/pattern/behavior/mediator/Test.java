package pattern.behavior.mediator;

public class Test {
    public static void main(String[] args) {
        MyMediator mediator=new MyMediator();

        Renter renter1 = new Renter("1001", "r1", mediator);
        Renter renter2 = new Renter("1002", "r2", mediator);
        Renter renter3 = new Renter("1003", "r3", mediator);

        Saler saler1 = new Saler("8001", "s1", mediator);
        Saler saler2 = new Saler("8002", "s2", mediator);
        Saler saler3 = new Saler("8003", "s3", mediator);

        mediator.addRenter(renter1);
        mediator.addRenter(renter2);
        mediator.addRenter(renter3);
        mediator.addSaler(saler1);
        mediator.addSaler(saler2);
        mediator.addSaler(saler3);

        renter2.send("r2要租房");
        System.out.println("======================");
        saler1.send("s1有房要出租");

    }
}
