import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trading {

	private Product product;

	private OfferingList offeringList;

	List<String> items = new ArrayList<>();

	public Trading(String userName){
		try{
			FileInputStream file1 = new FileInputStream("textFiles/UserProduct.txt");
			Scanner sc1 = new Scanner(file1);

			while(sc1.hasNextLine()) {
				String line = sc1.nextLine();
				String[] arr = line.split(":",2);
				List<String> stringList = new ArrayList<>();
				if(arr[0].equals(userName)){
					items.add(arr[1]);
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public void showTrades(){
		ProductIterator iterator = new ProductIterator(items);
		int i = 1;

		System.out.println("You made a bid for the following items: ");
		while(iterator.hasNext()){
			String item = iterator.Next();
			System.out.println(i + ") " + item);
			i++;
		}
	}
	public void accept(NodeVisitor visitor) {

	}

}
