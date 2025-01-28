package collections_sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupchars {
	
	public static void main(String[] args) 
	{
		String a="welcome";
		Set<Character> uniq= new LinkedHashSet<Character>();
		Set<Character> dups= new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++) 
		{
			//uniq.add(a.charAt(i));
			if(!uniq.add(a.charAt(i))) 
			{
				dups.add(a.charAt(i));
			}
		}
		uniq.removeAll(dups);
		StringBuffer sb=new StringBuffer();
		for(char value:uniq) {
			sb.append(value);
		}
		System.out.println(sb.toString());
		
		
	}

}
