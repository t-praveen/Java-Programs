package Recursion;
import java.util.Scanner;


public class PascalTriangle {
	
	static int tri(int num){
		
		int f = 1 , i = 1 ;
		 while(i <= num )
		 {
			 f = f * i ;
			 i++;
			 
		 }
		 return f ;
		
	}

	public static void main(String[] args) {

		int line ; 
		int i , j ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of lines: ");
		line = sc.nextInt();
		for(i = 0 ; i < line ; i++)
		{
			for(j = 0 ; j < line - i - 1 ; j++)
			{
				System.out.print(" ");
			}
			for(j = 0 ; j <= i ; j++)
			{
				System.out.print(" "+ tri(i) / (tri(j) * tri(i - j)));	
			}
			System.out.println(" ");
		}
	}

}
