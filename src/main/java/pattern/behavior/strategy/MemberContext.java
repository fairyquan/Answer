package pattern.behavior.strategy;

public class MemberContext {
    private MemberStrategy memberStrategy;

    public MemberContext(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }
    public double calPrice(double price,int n){
        return memberStrategy.calPrice(price,n);
    }
}
