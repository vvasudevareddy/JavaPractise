package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Greatest_integer {
	public static void main(String[] args) {
		Integer a[]= {9,3,6,4,8,5};
		List<Integer> lst=Arrays.asList(a);
		Collections.sort(lst);
		System.out.println(lst.get(lst.size()-1));
	}

}
