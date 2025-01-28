package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Smallest_Integer {

	public static void main(String[] args) {
		
		Integer a[]= {9,3,6,4,8,5};
		List<Integer> lst1 = Arrays.asList(a);
		
		System.out.println("Given array: "+lst1);
		Collections.sort(lst1);
		
		System.out.println("The smallest Integer in the given array list: "+lst1.get(0));
	}

}
