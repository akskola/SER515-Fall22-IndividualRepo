import java.util.Scanner;

public class Buyer extends Person {
	int optionType;
	int productType;
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- Buyer Menu -----");
		System.out.println("0) View product list     1) View my bid     2) Exit");
		System.out.println("Enter your choice: ");
		optionType = sc.nextInt();

		if(optionType == 0){
			System.out.println("\n (((( FACTORY IMPLEMENTED ))))\n");
			System.out.println("0) Meat		1) Produce");
			System.out.println("Enter your choice: ");
			productType = sc.nextInt();
			if(productType == 0){
				MeatProductMenu menu1 = new MeatProductMenu();
				menu1.showMenu();
			} else if (productType == 1) {
				ProduceProductMenu menu2 = new ProduceProductMenu();
				menu2.showMenu();
			}
			else {
				System.out.println("Invalid choice");
			}

		} else if (optionType == 1) {

		}

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
