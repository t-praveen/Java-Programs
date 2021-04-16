package Recursion;
import java.util.Scanner;
public class EvenOdd {
	
	static int EO(int n)
	{
		if(n%2==0)
			System.out.println(n+" is Even");
		else
			System.out.println(n+" is Odd");
		return n;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is even or odd:");
		int n = sc.nextInt();
		EO(n);
		sc.close();
		
		

	}

}
