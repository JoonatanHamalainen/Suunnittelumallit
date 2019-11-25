package visitor;

public interface Visitor {
	public abstract void visit(Fighter fighter);
	public abstract void visit(Tank tank);
	public abstract void visit(Marksman marksman);
}
