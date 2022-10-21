import java.util.Scanner;

public class Buyer extends Person {
	int optionType;
	int productType;
	int userType = 0;

	public Buyer(String userName){
		this.name = userName;
	}
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------ Buyer Menu ------\n");
		System.out.println("1) View products list\n2) View my bidding\n3) Exit\n");
		System.out.println("Enter your choice: ");
		optionType = sc.nextInt();

		switch (optionType) {
			case 1 -> {
				System.out.println("\n~~~~~ FACTORY IMPLEMENTED ~~~~~\n");
				System.out.println("1) Meat\n2) Produce\n");
				System.out.println("Enter your choice: ");
				productType = sc.nextInt();
				if(productType == 1){
					MeatProductMenu menu1 = new MeatProductMenu();
					menu1.showMenu(userType);
				} else if (productType == 2) {
					ProduceProductMenu menu2 = new ProduceProductMenu();
					menu2.showMenu(userType);
				}
				else {
					System.out.println("Invalid choice");
				}
			}
			case 2 -> {
				Trading trading = new Trading(this.name);
				trading.showTrades();
			}
			case 3 -> System.out.println("\nLogging out...");
			default -> System.out.println("\nInvalid choice");
		}
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
