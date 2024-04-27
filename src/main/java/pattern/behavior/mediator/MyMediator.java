package pattern.behavior.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMediator implements Mediator{
    Map<String,Renter> renterMap=new HashMap<>();
    Map<String,Saler> salerMap=new HashMap<>();
    @Override
    public void addRenter(Renter renter){
        renterMap.put(renter.getAccount(),renter);
    }
    @Override
    public void addSaler(Saler saler){
        salerMap.put(saler.getAccount(),saler);
    }

    public void send(Renter renter, String msg) {
        System.out.println("来自租客"+renter.getAccount()+"--"+renter.getName());
        System.out.println("\t"+msg);
        Set<String> set = salerMap.keySet();
        for (String key : set) {
            Saler saler = salerMap.get(key);
            saler.receive(renter.getAccount() + "--" + renter.getName() + "--" + msg);
        }
    }
    public void send(Saler saler, String msg) {
        System.out.println("来自房东"+saler.getAccount()+"--"+saler.getName());
        System.out.println("\t"+msg);
        Set<String> set = renterMap.keySet();
        for (String key : set) {
            Renter renter = renterMap.get(key);
            renter.receive(saler.getAccount() + "--" + saler.getName() + "--" + msg);
        }
    }
}
