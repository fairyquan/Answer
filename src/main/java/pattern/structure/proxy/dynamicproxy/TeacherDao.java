package pattern.structure.proxy.dynamicproxy;


class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public void rest() {
        System.out.println("老师休息中...");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }


}
