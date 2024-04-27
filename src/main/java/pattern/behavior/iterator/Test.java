package pattern.behavior.iterator;

public class Test {
    public static void main(String[] args) {
       Container container=new NameRepository();
       container.add("a");
       container.add("b");
       container.add("c");
       container.add("d");
        Iterator iterator = container.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
