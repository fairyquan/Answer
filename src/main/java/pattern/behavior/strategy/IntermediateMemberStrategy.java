package pattern.behavior.strategy;

public class IntermediateMemberStrategy implements MemberStrategy{
    @Override
    public double calPrice(double price, int n) {
        return (price*n)-price*n*0.1;
    }
}
