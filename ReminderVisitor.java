import java.util.List;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public ReminderVisitor(){
		System.out.println("\n~~~~~ VISITOR IMPLEMENTED ~~~~~\n");
	}

	public void visitProduct(List<String> users) {
		System.out.println("Bidder(s) " + users + " will be notified");
	}

	public void visitTrading(int userType) {
		String str = userType == 0 ? "Seller" : "Buyers";
		System.out.println(str + " will be notified");
	}

	public void visitFacade(Facade facade) {

	}

}
