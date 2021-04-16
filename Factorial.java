package Recursion;
import java.util.Scanner;

public class Factorial {
	
	static int factor(int n)
	{
		int fact = 1 ;
		for(int i = 1 ; i <= n ; i++)
			fact = fact * i ;
		return fact ;
	}
	


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to display its factorial:");
		int n = sc.nextInt();
		System.out.println("The factorial of the given number is:"+factor(n));
		sc.close();
	
	
	}
}
