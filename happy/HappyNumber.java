package happy;
import java.util.Scanner;

public class HappyNumber {
	
	static int HN(int n)
	{
		int temp ;
		int sum = 0 ;
		while(sum != 1 && sum != 4)
		{
			sum = 0 ;
			while(n > 0)
			{
				temp = n % 10 ;
				sum += (temp * temp);
				n = n / 10 ;
			}
			n = sum ;
		}
		if(sum == 1)
		{
			System.out.println("It is a Happy Number . ");
		}
		else
		{
			System.out.println("It is not a Happy Number . ");
		}
		return n ;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is happy or not : ");
		int n = sc.nextInt();
		HN(n);
		sc.close();
		
	}

}
