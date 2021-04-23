package typeconversions;
import java.util.Scanner;

public class ExplicitTypeConversion1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		double d = sc.nextDouble();
		System.out.println("You have entered : "+d);
		int n = (int) d ;
		System.out.println("After Explicit Conversion , the value is : "+n);
		sc.close();
		

	}

}
