package Recursion;       
import java.util.Scanner; 
   
public class Fibonacci {
	
	static int Fib(int n)
	{
		int result = 0 , i = 1;
		int a = 0 , b = 1 ;
		while(i <= n)
		{
			System.out.print(a+" ");
			result = a + b ;
			a = b ;
			b = result ; 
			i++ ;	
		}
		return result;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci range to be displayed:");
		int n = sc.nextInt();
		Fib(n);
		sc.close();
	}

}
