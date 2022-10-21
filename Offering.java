import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Offering {

	private OfferingList offeringList;
	List<String> offeredItems = new ArrayList<>();
	HashMap<String, List<String>> offerings = new HashMap<>();

	public Offering(String userName){
		try{
			FileInputStream file1 = new FileInputStream("textFiles/UserProduct.txt");
			Scanner sc1 = new Scanner(file1);

			while(sc1.hasNextLine()) {
				String line = sc1.nextLine();
				String[] arr = line.split(":",2);
				List<String> stringList = new ArrayList<>();
				if(arr[0].equals(userName)){
					offeredItems.add(arr[1]);
					offerings.put(arr[1], stringList);
				}
			}

			FileInputStream file2 = new FileInputStream("textFiles/UserProduct.txt");
			Scanner sc2 = new Scanner(file2);

			while(sc2.hasNextLine()) {
				String line2 = sc2.nextLine();
				String[] arr = line2.split(":",2);
				if(offerings.containsKey(arr[1]) && !arr[0].equals(userName)){
					offerings.get(arr[1]).add(arr[0]);
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

	public void showOffers(String userName){
		try{
			OfferingIterator iterator = new OfferingIterator(offeredItems);
			int i = 1;
			System.out.println("Tradings for products offered by " + userName +":");
			while(iterator.hasNext()){
				String item = iterator.Next();
				System.out.println(i + ") " + item + ", bidders:" + offerings.get(item));
				i++;
			}

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public void removeOffer(String userName){
		OfferingIterator iterator = new OfferingIterator(offeredItems);
		int i = 1;
		System.out.println("Products offered by " + userName +":");
		while(iterator.hasNext()){
			String item = iterator.Next();
			System.out.println(i + ") " + item);
			i++;
		}

		System.out.println("\nSelect an item to be removed: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<String> bidders = offerings.get(offeredItems.get(num-1));
		System.out.println("\n" + offeredItems.get(num-1) + " has been removed from the list");

		ReminderVisitor visitor = new ReminderVisitor();
		visitor.visitProduct(bidders);
	}

}
