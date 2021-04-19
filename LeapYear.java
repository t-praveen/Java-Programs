package Recursion;
import java.util.Scanner;

public class LeapYear {
	
	static int LY(int n)
	{
		if(n % 400 == 0)
		{
			System.out.print(n+" is a Leap year.");
		}
		else if(n % 100 == 0)
		{
			System.out.print(n+" is not a Leap year.");
		}
		else if(n % 4 == 0)
		{
			System.out.print(n+" is a Leap year.");
		}
		else
		{
			System.out.print(n+" is not a Leap year.");
		}
		return n ;
	}

	public static void main(String[] args) {

		int year ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check wether it is leap year or not: ");
		year = sc.nextInt();
		LY(year);
		sc.close();
		
	}

}
