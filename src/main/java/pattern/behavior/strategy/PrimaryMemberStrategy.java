package pattern.behavior.strategy;

public class PrimaryMemberStrategy implements MemberStrategy{
    @Override
    public double calPrice(double price, int n) {
        return price*n;
    }
}
