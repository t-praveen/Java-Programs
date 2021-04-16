package Recursion;
import java.util.Scanner;

public class PrimeLogic1 {
	
	static int P1(int n)
	{
		int count = 0;
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(n+" is a Prime number.");
		}
		else
		{
			System.out.println(n+" is a Non-Prime number.");
		}
		return n;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to chech wether it is prime or not:");
		int n = sc.nextInt();
		P1(n);
		sc.close();

	}

}
