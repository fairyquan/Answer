package pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
	private String type;
	private ArrayList<File> files = new ArrayList<>();
	public FileFindVisitor(String type) {
		this.type = type;
	}
	//返回已找到文件数组的迭代器
	public Iterator getFoundFiles(){
		return files.iterator();
	}
    //如果是文件，则将文件加入数组里
	@Override
	public void visit(File file) {
		if(file.getName().endsWith(type)){
			files.add(file);
		}
	}
    //如果是文件夹，则递归访问，直至访问到文件
	@Override
	public void visit(Directory directory) {
		Iterator it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}

	}

}

