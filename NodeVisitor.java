import java.util.List;

public abstract class NodeVisitor {

	public abstract void visitProduct(List<String> users);

	public abstract void visitTrading();

	public abstract void visitFacade(Facade facade);

}
