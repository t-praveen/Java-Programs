package auto;
import java.util.Scanner;


public class AutoMorphicNumber {
	
	static int AMN(int n)
	{
		int num , sq , r , t ;//n for num , sq for square , r for remainder , t for divisor
		boolean equal = false ; // for checking
		num = n ;
		sq = n * n ;
		t = 10 ;
		System.out.println("\nSquare of "+n+" is "+sq);
		while(n > 0)
		{
			r = sq % t ;
			if(num == r)
			{
				equal = true ; 
				break ; 
			}
			n = n / 10 ;
			t = t * 10 ;
		}
		if(equal == true)
		{
			System.out.println(num+" is a AutoMorphic Number . ");
		}
		else
		{
			System.out.println(num+" is not an AutoMorphic Number . ");
		}
		return num ;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is Automorphic or not : ");
		int n = sc.nextInt();
		AMN(n);
		sc.close();
		
	}

}
