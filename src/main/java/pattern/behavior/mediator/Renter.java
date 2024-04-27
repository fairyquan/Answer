package pattern.behavior.mediator;

public class Renter extends User{
    private String account;
    private String name;

    public Renter( String account, String name,Mediator mediator) {
        super(mediator);
        this.account = account;
        this.name = name;
    }

    @Override
    public void receive(String msg){
        System.out.println(account+"\t"+name+"receive:"+"\r\n"+msg);
    }
    @Override
    public void send(String msg){
        mediator.send(this,msg);
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
}
