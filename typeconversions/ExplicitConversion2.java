package typeconversions;
import java.util.Scanner;

public class ExplicitConversion2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n  = sc.nextInt();
		System.out.println("You have entered : "+n);
		char c = (char) n ;
		System.out.println("After Explicit Conversion , the value is : "+c);
		sc.close();
		

	}

}
