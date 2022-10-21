public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private Login login;

	public Facade() {
		System.out.println("\n~~~~~ FACADE IMPLEMENTED ~~~~~\n");
	}

	public boolean login() {
		login = new Login();
		login.getCredentials();
		return login.validateCredentials();
	}

	public void viewMenu(){
		if(login()){
			if(login.userType == 0){
				Buyer buyer = new Buyer(login.userName);
				buyer.showMenu(); //show buyer's menu
			} else if (login.userType == 1) {
				Seller seller = new Seller(login.userName);
				seller.showMenu(); //show seller's menu
			}
		}
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
