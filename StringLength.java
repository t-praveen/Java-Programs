package strings;
import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to find its length : ");
		String s = sc.nextLine();
		System.out.println("The length of the string is : "+s.length());
		sc.close();
	}

}
