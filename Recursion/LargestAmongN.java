package Recursion;
import java.util.Scanner;

public class LargestAmongN {
	
	static int Max_num(int a[],int n)
	{
		int m = 0 , i;
		for(i = 0 ; i < n ; i++)
		{
			if(a[i] > m)
			{
				m = a[i];
			}
		}
		return m;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers:");
		int n = sc.nextInt();
		int max , i ;
		int a[] = new int[n];
		System.out.println("Enter numbers:");
		for(i = 0 ; i < n ; i++)
			a[i] = sc.nextInt();
		max = Max_num(a,n);
		System.out.println("The largest number is:"+max);
		sc.close();

	}

}
