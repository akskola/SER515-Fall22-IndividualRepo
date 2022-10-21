import java.util.Scanner;

public class Seller extends Person {
	int optionType;
	public Seller(String userName){
		this.name = userName;
	}
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------ Seller Menu ------\n");
		System.out.println("1) View tradings\n2) Remove an offering\n3) Exit\n");
		System.out.println("Enter your choice: ");
		optionType = sc.nextInt();

		switch (optionType) {
			case 1 -> {
				Offering offering = new Offering(this.name);
				offering.showOffers(this.name);
			}
			case 2 -> {
				Offering offering2 = new Offering(this.name);
				offering2.removeOffer(this.name);
			}
			case 3 -> System.out.println("\nLogging out...");
			default -> System.out.println("\nInvalid choice");
		}
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
