package collections_sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo_collections {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(23);
		lst.add(23);
		Iterator<Integer> itr=lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
 
}
