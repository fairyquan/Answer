package pattern.behavior.iterator;

public class NameRepository implements Container{
    private Object[] arr;
    private int size;
    private int index;

    public NameRepository() {
        this.arr = new Object[100];
        this.size = 0;
        this.index = 0;
    }

    @Override
    public void add(Object obj) {
        arr[index++]=obj;
        size++;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}
