package com.criticalThinking.one;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class VowelCount {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String,Integer> vowelCount=new LinkedHashMap<>();
		
		System.out.println("Enter the number of fruits:");
		int n=Integer.parseInt(sc.nextLine());
		String fruits[]=new String[n];
		
		System.out.println("Enter the fruits data:");
		for(int i=0;i<fruits.length;i++) 
		{
			fruits[i]=sc.nextLine();
		}

		for(int i=0;i<fruits.length;i++)
		{
			String word=fruits[i].replaceAll("[^aeiouAEIOU]","");
			vowelCount.put(fruits[i], word.length());
		}
		
		
		for(String item:vowelCount.keySet())
		{
			System.out.println(item+" "+vowelCount.get(item));
		}
		
		
		
	}

}
