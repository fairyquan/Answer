package pattern.behavior.iterator;

public class ConcreteIterator implements Iterator{
    private Container container;
    private int index;

    public ConcreteIterator(Container container) {
        super();
        this.container = container;
    }

    @Override
    public boolean hasNext() {
        return index < container.getSize();
    }

    @Override
    public Object next() {
        Object object=container.get(index);
        index++;
        return object;
    }
}
