package neon;
import java.util.Scanner;

public class NeonNumber {
	
	static int NN(int n)
	{
		int sq , sum = 0 ;
		sq = n * n ;
		while(sq > 0)
		{
			sum = sum + sq % 10 ; 
			sq = sq / 10 ;
		}
		if(sum == n)
		{
			System.out.println(n+" is a Neon Number.");
		}
		else
		{
			System.out.println(n+" is not a Neon Number.");
		}
		return n ;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is a neon number or not : ");
		int n = sc.nextInt();
		NN(n);
		sc.close();

	}

}
