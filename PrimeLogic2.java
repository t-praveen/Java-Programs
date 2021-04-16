package Recursion;
import java.util.Scanner;

public class PrimeLogic2 {

		static int P2(int n)
		{
			int j = 2 ;
			int ch = 0 ;
			if(n <= 1)       //to check for 1
				ch = 1;
			
			while(j <= n/2)
			{
				if(n % j == 0 )
				{
					ch = 1;
					break;
				}
				else
				{
					j++ ;
				}
			}
			if(ch == 0)
				System.out.println(n+" is Prime.");
			else
				System.out.println(n+" is not a Prime.");
			return n;
		}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to chech wether it is prime or not:");
		int n = sc.nextInt();
		P2(n);
		sc.close();
		
		

	}

}
