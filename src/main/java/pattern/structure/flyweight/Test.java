package pattern.structure.flyweight;

public class Test {
    public static void main(String[] args) {
        Tree a = TreeFactory.getTree("1", "a");
        Tree b = TreeFactory.getTree("2", "b");
        Tree c = TreeFactory.getTree("3", "c");
        Tree b1 = TreeFactory.getTree("2", "b");

        System.out.println(a==b);
        System.out.println(b1==b);


    }
}
