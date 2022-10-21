import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduceProductMenu extends ProductMenu {
	List<String> items = new ArrayList<>();
	public void showMenu() {
		try{
			FileInputStream file1 = new FileInputStream("textFiles/ProductInfo.txt");
			Scanner sc1 = new Scanner(file1);

			while(sc1.hasNextLine()) {
				String line = sc1.nextLine();
				String[] arr = line.split(":",2);
				if(arr[0].equals("Produce")){
					items.add(arr[1]);
				}
			}

			sc1.close();
			showItems();

			System.out.println("Select an item to buy: ");
			Scanner sc2 = new Scanner(System.in);
			int option = sc2.nextInt();

			System.out.println(items.get(option-1) + " has been added to your bidding list");

			ReminderVisitor visitor = new ReminderVisitor();
			visitor.visitTrading();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public void showItems(){
		ProductIterator iterator = new ProductIterator(items);
		int i = 1;

		while(iterator.hasNext()){
			String item = iterator.Next();
			System.out.println(i + ") " + item);
			i++;
		}
		System.out.println();
	}
	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
