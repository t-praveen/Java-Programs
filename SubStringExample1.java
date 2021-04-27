package strings;
import java.util.Scanner;

public class SubStringExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String S1 = sc.nextLine();
		System.out.println("After implementing the Substring method the 1st String is : "+S1.substring(0));
		System.out.println("After implementing the Substring method the 2nd String is : "+S1.substring(5));
		System.out.println("After implementing the Substring method the 3rd String is : "+S1.substring(0 , 7));
		System.out.println("After implementing the Substring method the 4th String is : "+S1.substring(3 , 7));
		System.out.println("After implementing the Substring method the 5th String is : "+S1.substring(3 , 5));
		System.out.println("After implementing the Substring method the 6th String is : "+S1.substring(1 , 5));
		sc.close();
	}

}
