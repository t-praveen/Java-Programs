package Recursion;
import java.util.Scanner;


public class Swapping {
	
	static void swap(int a, int b)
	{
		int temp;
		temp = a ;
		a = b ; 
		b = temp ;
		System.out.println(a+" "+b);
		
	}

	public static void main(String[] args) {
	
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		System.out.println("Before swapping ,  the 2 numbers are:"+a+" "+b);
		System.out.print("After swapping the 2 numbers are:");
		swap(a,b);
		sc.close();
	}
}
