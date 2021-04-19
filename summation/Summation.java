package summation;
import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("First Number : ");
			int a = sc.nextInt();
			
			System.out.print("Common Diff. : ");
			int d = sc.nextInt();
			
			System.out.print("Number Count : ");
			int n = sc.nextInt(); 
			
			/*int s = n * (2 * a + ( n - 1 ) * d ) / 2 ;
			System.out.println("Total : "+ s);
			System.out.println();*/
			
			int total = a ;
			for(int i = 1 ; i < n ; i++)
			{
				a += d ;
				 total += a ;
				 
			}
			
			System.out.println("Total : "+ total);
			System.out.println();
		}
		
	}

}
