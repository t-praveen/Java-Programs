package switchCase;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rating from 1 to 5:");
		int rating = sc.nextInt();
		switch(rating)
		{
			case 1:
			case 2:
					System.out.println("Good Review.");
					break;
			case 3: System.out.println("Average Review.");
					break;
			case 4:
			case 5:
					System.out.println("Bad Review.");
					break;
			default: System.out.println("Invalid Input.");
			sc.close();
			
		}
	
	}

}
