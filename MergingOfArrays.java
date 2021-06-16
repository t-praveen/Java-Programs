//MERGING OF 2 ARRAYS //

package Recursion;
import java.util.Scanner;

public class MergingOfArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the 1st array : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the elements into the 1st array : ");
		int arr1 [] = new int[n1];
		for(int i = 0 ; i < n1 ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of the 2nd array : ");
		int n2 = sc.nextInt();
		System.out.print("Enter the elements into the 2nd array : ");
		int arr2 [] = new int[n2];
		for(int i = 0 ; i < n2 ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("Content of the 1st array : ");
		for(int i = 0 ; i < n1 ; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Content of the 2nd array : ");
		for(int i = 0 ; i < n2 ; i++)
		{
			System.out.println(arr2[i]);
		}
		MERGINGARRAY(arr1 , n1 , arr2 , n2);
		sc.close();
	}
	public static void MERGINGARRAY(int arr1[] , int n1 , int arr2[] , int n2)
	{
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		int v = 0 ;
		int max = n1 + n2 ;
		int resultArray[] = new int[max] ;
		while(v < max)
		{
			if(j < n1)
			{
				resultArray[v] = arr1[j];
				j++ ;
				v++ ;
			}
			if(k < n2)
			{
				resultArray[v] = arr2[k];
				k++ ;
				v++ ;
			}
		}
		System.out.println("\n\nElements of the Merged array are : ");
		for(i = 0 ; i < max ; i++)
		{
			System.out.println(resultArray[i]+" ");
		}
	}
}
