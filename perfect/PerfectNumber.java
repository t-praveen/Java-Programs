package perfect;
import java.util.Scanner;

public class PerfectNumber {
	
	static int Per(int n)
	{
		int i = 1 ;  
		int sum = 0 ;
		while(i < n)
		{
			if(n % i == 0)
			{
				sum += i ;		
			}
			i++;
		}if(sum == n)
		{
			System.out.println(i+" is a Perfect number.");
		}
		else
		{
			System.out.println(i+" is a not a Perfect number.");
		}
		return i ;
	}

	public static void main(String[] args) {

		int n ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is a Perfect number or not : ");
		n = sc.nextInt();
		Per(n);
		
	}

}
