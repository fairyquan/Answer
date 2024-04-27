package pattern.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        MemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy();
        MemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();
        MemberStrategy advanceMemberStrategy = new AdvanceMemberStrategy();

        MemberContext primaryContext = new MemberContext(primaryMemberStrategy);
        MemberContext intermediateContext = new MemberContext(intermediateMemberStrategy);
        MemberContext advanceContext = new MemberContext(advanceMemberStrategy);

        System.out.println("普通会员价格："+primaryContext.calPrice(300,1));
        System.out.println("中级会员价格："+intermediateContext.calPrice(300,1));
        System.out.println("高级会员价格："+advanceContext.calPrice(300,1));
    }
}
