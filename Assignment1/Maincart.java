package assignment1listarray;

public class Maincart extends Shoppingcart {

	public static void main(String[] args) {
		Item i1 = new Item(1, "luxsoap","lux",10);
		Item i2 = new Item(2, "soda","lux",10);
		Item i3 = new Item(3, "juice","lux",10);
		Item i4 = new Item(4, "lays","lux",10);



		Maincart cart = new Maincart();
		cart.addToCart(i1, 1);
		cart.addToCart(i2, 1);
		cart.addToCart(i3, 1);
		cart.addToCart(i4, 1);

		cart.displayQty(i1);
		cart.updateQty(i1, 3);
		cart.deleteItem(i1);
		cart.displayBill();

	}


}
