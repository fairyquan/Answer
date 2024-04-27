package pattern.behavior.strategy;

public class AdvanceMemberStrategy implements MemberStrategy{
    @Override
    public double calPrice(double price, int n) {
        return (price*n)-price*n*0.2;
    }
}
