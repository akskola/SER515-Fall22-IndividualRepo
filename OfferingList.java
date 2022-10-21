import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfferingList {

	private Trading trading;

	private Offering[] offering;

	private OfferingIterator offeringIterator;

	public List<String> getList(String userName){
		try{
			FileInputStream file1 = new FileInputStream("textFiles/UserProduct.txt");
			Scanner sc1 = new Scanner(file1);
			List<String> list = new ArrayList<>();

			while(sc1.hasNextLine()) {
				String line = sc1.nextLine();
				String[] arr = line.split(":",2);
				List<String> stringList = new ArrayList<>();
				if(arr[0].equals(userName)){
					list.add(arr[1]);
				}
			}
			return list;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
