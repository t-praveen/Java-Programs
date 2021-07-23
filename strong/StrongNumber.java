package strong; 
import java.util.Scanner;

public class StrongNumber {
	
	static int SN(int num)
	{
		int i , p , r ;
		int sum = 0 ;
		int x ;
		x = num ;
		while(num != 0)
		{
			i = 1 ;
			p = 1 ;
			r = num % 10 ;
			while(i <= r)
			{
				p = p * i ;
				i++;
			}
			sum = sum + p ;
			num = num / 10 ;
			}
		if(sum == x)
		{
			System.out.println(x+" is a Strong Number .");
		}
		else
		{
			System.out.println(x+" is not a Strong number .");
		}
		return x ;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is strong or not : ");
		int num = sc.nextInt();
		SN(num);

		
		
	}

}
