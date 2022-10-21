import java.util.List;

public class OfferingIterator {

	private OfferingList offeringList;
	List<String> itemList;
	int currentItemNumber = -1;

	public OfferingIterator(List<String> items){
		System.out.println("\n~~~~~ ITERATOR IMPLEMENTED ~~~~~\n");
		itemList = items;
	}

	public boolean hasNext() {
		if(currentItemNumber < itemList.size()-1){
			return true;
		}
		else {
			return false;
		}
	}

	public String Next() {
		if(hasNext()){
			currentItemNumber++;
			return itemList.get(currentItemNumber);
		}
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
