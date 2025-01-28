package lamdaDemo;
import java.util.Scanner;
public class Validate {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		Validator v;
		v=(str)->str.contains("@");
		System.out.println(v.validate(str1));
		v=(str)->(str.matches("[a-zA-Z]+"));
		System.out.println(v.validate(str1));
		v=(str)->(str.length()==4);
		System.out.println(v.validate(str1));
	}

}
