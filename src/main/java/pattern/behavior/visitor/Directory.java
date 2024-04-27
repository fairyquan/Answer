package pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;

//文件夹类，提供文件夹的相关数据
public class Directory extends Entry {
	private String name;
	private ArrayList<Entry> dir = new ArrayList<>();
	public Directory(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Entry o : dir) {
			Entry entry = o;
			size += entry.getSize();
		}
		return size;
	}
	@Override
	public Entry add(Entry entry){
		dir.add(entry);
		return this;
	}
	@Override
	public Iterator iterator(){
		return dir.iterator();
    }
}

