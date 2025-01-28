package collections_sample;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		if (str.matches("[^a-zA-Z ]+")) {
			System.out.println("Invalid sentence");
			return;
		}
		String sentence[] = str.split(" ");
		if(!(sentence.length>1))
		{
			System.out.println("Invalid sentence");
			return;
		}
		String maxlength = sentence[0];
		for (String t : sentence) {
			if (t.length() > maxlength.length()) {
				maxlength = t;
			}
		}

		StringBuilder s = new StringBuilder(maxlength);
		StringBuilder rev = s.reverse();

		System.out.println(rev);

	}

}
