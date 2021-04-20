package spy;
import java.util.Scanner;

public class SpyNumber {
	
	static int SPN(int n)
	{
		int sum = 0 , prod = 1 ;
		int d ; 
		while(n > 0)
		{
			d = n % 10 ;
			sum += d ;
			prod *= d ;
			n = n / 10 ;
		}
		if(sum == prod)
		{
			System.out.println("It is a Spy Number . ");
		}
		else
		{
			System.out.println("It is not a Spy Number . ");
		}
		return n ;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is a Spy Number or not : ");
		int n = sc.nextInt();
		SPN(n);
		sc.close();


	}

}
