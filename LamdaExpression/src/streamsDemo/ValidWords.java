package streamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidWords {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		List<String>lst=new ArrayList<String>();
		lst.add(str);
		List<String>lst1=new ArrayList<String>();
		lst1=lst.stream().filter((s)->s.matches("[a-zA-Z]+"))
				.collect(Collectors.toList());
		
		System.out.println(lst);
		System.out.println(lst1);
		
		
		
	}

}
