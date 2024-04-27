package pattern.behavior.visitor;

//数据结构的访问接口，声明数据结构对于访问者的接受方法
public interface Element {
	public abstract void accept(Visitor v);
}

