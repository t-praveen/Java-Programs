package typeconversions;
import java.util.Scanner;

public class ImplicitConversion2 {
	public static void main(String[] args) {
			 	Scanner sc = new Scanner(System.in);
				System.out.println("Enter a value : ");
			    int myInt = sc.nextInt();
			    double myDouble = myInt; 
			    System.out.println("You have entered : "+myInt);      
			    System.out.println("After Implicit Conversion ,  the value is : "+myDouble);
			    sc.close();
		 }
}
