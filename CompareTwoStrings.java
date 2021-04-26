package strings;
import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter 2nd String : ");
		String s2 = sc.nextLine();
		System.out.print("Enter 3rd String : ");
		String s3 = sc.nextLine();
		boolean result1 = s1.equals(s2);
		System.out.println("String 1st and 2nd are equal : "+result1);
		boolean result2 = s1.equals(s3);
		System.out.println("String 1st and 2nd are equal : "+result2);
		sc.close();
		
	}

}
