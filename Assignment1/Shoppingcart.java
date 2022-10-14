package assignment1listarray;
import java.util.*;

public class Shoppingcart {
	static HashMap<Item, Integer> mapcart = new HashMap<>();
	double totalprice = 0;
	int quantity;
	double total;
	
	public void addToCart(Item Item, Integer quantity) {
		mapcart.put(Item, quantity);
		System.out.println("Cart:");
		showcart();
	}
	public void displayQty(Item Item) {
		System.out.println("\nquantity of this item is"+mapcart.get(Item));
	}
	public void updateQty(Item Item, Integer quantity) {
		mapcart.put(Item, quantity);
		System.out.println("\nupdated cart");
		showcart();
	}
	public void deleteItem(Item Item) {
		mapcart.remove(Item);
		System.out.println("\n");
		showcart();
	}
	/*public double total(Item Item) {
		total = Item.price*mapcart.get(Item);
		return total;
		
	}*/
	public void displayBill() {
		for(Map.Entry<Item, Integer> entry: mapcart.entrySet()) {
			totalprice+= entry.getKey().price*entry.getValue();
		}
		System.out.println("total price of the cart is"+ totalprice);
	}
	public void showcart() {
		for(Map.Entry<Item, Integer> entry:mapcart.entrySet()) {
			System.out.println(entry.getKey().name + ":" + entry.getValue());
		}
	}
	
	

}
