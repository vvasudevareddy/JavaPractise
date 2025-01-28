package collections_sample;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
public class NonRepeatingCharacter {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		String word=sc.nextLine();
		
		if(word.length()<4)
		{
			System.out.println("Sentence very short");
			return;
		}
		Set<Character> uniq=new LinkedHashSet<Character>();
		Set<Character> dupChars=new LinkedHashSet<Character>();
		for(int i=0;i<word.length();i++)
		{
			if(!uniq.add(word.charAt(i)))
			{
				dupChars.add(word.charAt(i));
			}
		}
		uniq.removeAll(dupChars);
		if(uniq.isEmpty())
		{
			System.out.println("No non repeating characters");
			return;
		}
		for(char ch:uniq)
		{
			System.out.println(ch);
			break;
		}
		
	}

}
