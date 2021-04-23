package typepromotions;
import java.util.Scanner;

public class TypePromotionsInExpressions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a byte value : ");
        byte b = sc.nextByte();
        System.out.println("Enter a char value : ");
        char c = sc.next().charAt(0);
        System.out.println("Enter a short integer value : ");
        short s = sc.nextShort();
        System.out.println("Enter a integer value : ");
        int i = sc.nextInt();
        System.out.println("Enter a float value : ");
        float f = sc.nextFloat();
        System.out.println("Enter a double value : ");
        double d = sc.nextDouble();
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("Result after all the promotions done is : "+result);
        sc.close();

		
		

	}

}
