package calci;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		System.out.println("Enter Operation:");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		switch(op)
		{
			case '+' : result = a + b;
					   break;
			case '-' : result = a - b;
					   break;
			case '*' : result = a * b;
			   		   break;
			case '/' : result = a / b;
			           break;
			case '%' : result = a % b;
			           break;
			default : System.out.println("Invalid Operation!!");
		}
		//sc.close();
		System.out.println("The result is:" +result);
		sc.close();
		

	}

}
