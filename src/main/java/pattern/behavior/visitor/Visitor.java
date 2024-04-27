package pattern.behavior.visitor;

//访问者的抽象类
public abstract class Visitor {
	//声明对不同数据结构的处理方法
	public abstract void visit(File file);
	public abstract void visit(Directory directory);
}

