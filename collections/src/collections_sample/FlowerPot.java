package collections_sample;
import java.util.Arrays;
import java.util.Scanner;

public class FlowerPot {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the elements");
		int flowerPots[]=new int[n];
		for(int i=0;i<n;i++)
		{
			flowerPots[i]=Integer.parseInt(sc.nextLine());
		}
		Arrays.sort(flowerPots);
		int left=0,right=n-1,index=0;
		int arrangedPots[]=new int[n];
		while(left<=right)
		{
			if(index%2==0)
			{
				arrangedPots[index++]=flowerPots[right--];
			}
			else
			{
				arrangedPots[index++]=flowerPots[left++];
			}
		}
		for(int item:arrangedPots)
		{
			System.out.print(item+" ");
		}
	}

}
