package typeconversions;
import java.util.Scanner;

public class ImplicitTypeConversion1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);
		System.out.println("You have entered : "+c);
		int i = c ;
		System.out.println("After Implicit Conversion ,  the value is : "+i);
		sc.close();
		

	}

}
