package fibbonaci;
import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0 , b = 1 , n , c = 0 , i = 1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range you want to display fibbonaci: ");
		n = sc.nextInt();
		System.out.println(a+" \n "+b);
		//for(int i = 2 ; i < n ; i++)
		while(i <= n )
		{
			c = a + b ;
			System.out.println(c);
			a = b ; 
			b = c ;
			i++;
		}
		
		

	}

}
