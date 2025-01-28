package collections_sample;

import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Practice_question {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid Array");
			return;
			
		}
		System.out.println("Enter the elements of the array 1");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array 2");
		int n1=sc.nextInt();
		if(n1<=0)
		{
			System.out.println("Invalid Array");
			return;
		}
		System.out.println("Enter the elements of the array 2");
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		if(n!=n1)
		{
			System.out.println("Invalid Array");
		}
		else {
			List <Integer> lst1=new ArrayList<Integer>();
			
			for(int i:arr)
			{
				lst1.add(i);
			}
			List <Integer> lst2=new ArrayList<Integer>();
			
			for(int i:arr1)
			{
				lst2.add(i);
			}
			lst1.retainAll(lst2);
			int sum=0;
			for(int item:lst1)
			{
				sum=sum+item;
			}
			
			System.out.println("Sum of the common elements is "+sum);
		}
		
	}
	
	
}
