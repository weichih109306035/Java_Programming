import java.util.ArrayList;
public class ItemManager {
	private ArrayList<Item> items;
	public ItemManager() {
		items=new ArrayList<Item>();
	}
	public void addNewItem(int ID, String name, double price) {
		Item i=new Item(ID,name,price);
		items.add(i);
	}
	public ArrayList<Item> getItems(){
		return items;
	}
	public Item findItem(String itemName) {
		for(Item i:items) {
			if((i.getName()).equals(itemName)) {
				return i;
			}
			break;
		}
		return null;
	}

}
