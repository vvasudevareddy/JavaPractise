package collections_sample;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PerfectCouple {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Wife Name & Husband Name:");
		String details[] = sc.nextLine().toLowerCase().split("-");

		ArrayList<Character> wn = new ArrayList<Character>();

		for (char ch : details[0].toCharArray()) {
			wn.add(ch);
		}
		Collections.sort(wn);
		ArrayList<Character> hn = new ArrayList<Character>();

		for (char ch : details[1].toCharArray()) {
			hn.add(ch);
		}
		Collections.sort(hn);
		if (wn.equals(hn)) {
			System.out.println("Perfect Couple");
			return;
		} else {
			System.out.println("Not a Perfect Couple");
		}
	}
}
//If the sentence contains even number of words,print the alternate last words and odd words we have to reverse the words in the sentence.
