package assignment1listarray;
import java.util.*;

public class Shoppingcart {
	HashMap<String, Integer> mapcart = new HashMap<>();
	double totalprice;
	int quantity;
	public void addToCart(Item Item, Integer quantity) {
		mapcart.put(Item.name, quantity);
		System.out.print(mapcart);
	}
	public void displayQty(Item Item) {
		System.out.println("\nquantity of this item is"+mapcart.get(Item.name));
	}
	public void updateQty(Item Item, Integer quantity) {
		mapcart.put(Item.name, quantity);
		System.out.println("\nupdated cart"+ mapcart);
	}
	public void deleteItem(Item Item) {
		mapcart.remove(Item.name);
		System.out.println("\n"+mapcart);
	}
	
	
	

}
