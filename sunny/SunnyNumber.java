//PROGRAM TO DISPLAY SUNNY NUMBER//

package sunny;
import java.util.Scanner;

public class SunnyNumber {
	
	static int SN(int n)
	{
		double x ; // for sqrt(num + 1) 
		x = Math.sqrt(n + 1);
		if((int)x == x)
		{
			System.out.println(n+" is a Sunny Number . ");
		}
		else
		{
			System.out.println(n+" is not a Sunny Number . ");
		}
		return n ; 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is Sunny or not : ");
		int n = sc.nextInt();
		SN(n);
		sc.close();

	}

}
