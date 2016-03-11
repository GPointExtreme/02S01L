package sorting.ue.carts;

import java.util.ArrayList;

import java.util.Collections;

public class CartDemo {

	public static void main(String[] args) {
		
		ArrayList<Cart> list = new ArrayList<>();
		Cart cart1 = new Cart("Dominik", 4, 5, 550);
		Cart cart2 = new Cart("David", 6, 5, 870);
		Cart cart3 = new Cart("Stefan", 2, 5, 750);
		
		list.add(cart1);
		list.add(cart2);
		list.add(cart3);
		
		System.out.println("Befor sorting:");
		
		for (Cart cart : list) {
			System.out.println(cart);
		}
		
		Collections.sort(list);
		
		System.out.println("After sorting:");
		
		for (Cart cart : list) {
			System.out.println(cart);
		}

	}

}
