package strings;
import java.util.Scanner;

public class JoinTwoStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String s1 = sc.nextLine(); 
		System.out.print("Enter 2nd String : ");
		String s2 = sc.nextLine();
		System.out.println("The Result after concatenation of 2 strings are : "+s1.concat(s2));
		sc.close();
		
	}

}
