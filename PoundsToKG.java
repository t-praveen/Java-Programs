//Program to convert pouds to kilogram//

package Recursion;
import java.util.Scanner ;

public class PoundsToKG {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in pounds : ");
		double pound = sc.nextDouble();
		System.out.println("After converting pounds into kg , the result is : "+PToKG(pound));
		sc.close();
	}
	public static double PToKG(double pound)
	{
		double p = 0.45359237 ;
		double result = pound * p ;
		return result ;
	}

}
