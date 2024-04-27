package pattern.structure.proxy.dynamicproxy;

class Test {
    public static void main(String[] args) {
        ITeacherDao target=new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        proxyInstance.teach();
        proxyInstance.rest();
        int sum = proxyInstance.sum(1, 2);
        System.out.println(sum);
    }


}
