package collections_sample;
import java.util.Scanner;

public class SmoothSentence {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String words[]=sc.nextLine().split(" ");
		boolean isSmooth=true;
		for(int i=0;i<words.length-1;i++) 
		{
			char lastChar=words[i].charAt(words[i].length()-1);
			char firstChar=words[i+1].charAt(0);
			if(lastChar!=firstChar)
			{
				isSmooth=false;
				break;
			}
		}
		System.out.println(isSmooth?"Smooth Sentence":"Not Smooth Sentence");
		
	}
}
