package pattern.behavior.visitor;

import java.util.Iterator;

//访问者的具体类，实现对数据结构的处理

public class ListVisitor extends Visitor {
	private String currentDir = "";
    //根据传入参数的不同，对同名方法进行重载
	@Override
	public void visit(File file) {
		System.out.println(currentDir +"/"+file);

	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir +"/"+directory);
		String saveDir = currentDir;
		currentDir = currentDir +"/"+directory.getName();
		Iterator it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentDir = saveDir;
	}

}

