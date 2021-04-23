package Explicittypecastinginexpressions;
import java.util.Scanner;

public class ExplicitTypeCastingInExpressions {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a byte value : ");
		byte b = sc.nextByte();
		b =  (byte) ( b * 2 ) ; 
		System.out.println("Result is : "+b);
		sc.close();
		
	}

}
