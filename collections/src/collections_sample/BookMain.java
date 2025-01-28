package collections_sample;
import java.util.Scanner;
import java.util.HashSet;

public class BookMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of records to be added");
		int n=Integer.parseInt(sc.nextLine());
		
		Category b=new Category();
		System.out.println("Enter the records (Category Name:Book Count)");
		for(int i=0;i<n;i++)
		{
			String bookDetails[]=sc.nextLine().split(":");
			b.addCategoryDetails(bookDetails[0], Integer.parseInt(bookDetails[1]));
		}
		System.out.println("Enter the book count to find the categories");
		int bc=Integer.parseInt(sc.nextLine());
		HashSet<String> bookSet=b.searchCategoryByBookCount(bc);
		for(String item:bookSet)
		{
			System.out.println(item);
		}
		
		
	}

}
