package pattern.structure.proxy.cglib;

public class Test {
    public static void main(String[] args) {
        TeacherDao teacherDao=new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();
    }
}
