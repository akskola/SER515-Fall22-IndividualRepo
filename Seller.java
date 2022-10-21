import java.util.Scanner;

public class Seller extends Person {
	int optionType;
	int productType;
	int userType = 1;
	public Seller(String userName){
		this.name = userName;
	}
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------ Seller Menu ------\n");
		System.out.println("1) View tradings\n2) Add an offering\n3) Remove an offering\n4) Exit\n");
		System.out.println("Enter your choice: ");
		optionType = sc.nextInt();

		switch (optionType) {
			case 1 -> {
				Offering offering = new Offering(this.name);
				offering.showOffers(this.name);
			}
			case 2 -> {
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
			case 3 -> {
				Offering offering2 = new Offering(this.name);
				offering2.removeOffer(this.name);
			}
			case 4 -> System.out.println("\nLogging out...");

			default -> System.out.println("\nInvalid choice");
		}
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
