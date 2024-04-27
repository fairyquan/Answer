package pattern.structure.proxy.staticproxy;

class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;//目标对象，通过接口聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始，完成某些操作");
        target.teach();
        System.out.println("提交");
    }
}
