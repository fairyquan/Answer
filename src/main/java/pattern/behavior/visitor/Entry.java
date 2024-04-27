package pattern.behavior.visitor;

import java.util.Iterator;

//数据结构的抽象类，中间声明了抽象方法
public abstract class Entry implements Element {

	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) {
		throw new UnsupportedOperationException();
	}
	public Iterator iterator() {
		throw new UnsupportedOperationException();
	}
	public String toString(){
		return getName()+"("+getSize()+")";
	}

}

