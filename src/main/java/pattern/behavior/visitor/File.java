package pattern.behavior.visitor;

//具体的实体类，文件类，提供类内数据
public class File extends Entry {

	private String name;
	private int size;
	public File(String name,int size) {
		this.name = name;
		this.size = size;
	}
	@Override
	public String getName(){
		return name;
	}
	@Override
	public int getSize(){
		return size;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}

