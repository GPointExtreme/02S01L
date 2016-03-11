package sorting.ue.carts;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart>{

	@Override
	public int compare(Cart o1, Cart o2) {
		int cmp=o1.getUsername().compareTo(o2.getUsername());
		
		if(cmp != 0) {
			return cmp;
		}
		return 0;
	}
	
	

}
