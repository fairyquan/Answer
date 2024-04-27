package pattern.structure.proxy.staticproxy;

class Test {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy=new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();//拓展了功能
    }
}
