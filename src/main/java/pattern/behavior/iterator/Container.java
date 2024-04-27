package pattern.behavior.iterator;

public interface Container {
    void add(Object obj);
    Object get(int index);
    Iterator iterator();
    int getSize();
}
