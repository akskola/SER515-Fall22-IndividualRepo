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

			for(int i = 0; i < items.size(); i++){
				System.out.println(i+1 + ") " + items.get(i) + "     ");
			}
			System.out.println("\n (((( ITERATOR IMPLEMENTED ))))\n");
		} catch (Exception e){
			e.printStackTrace();
		}
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
