package armstrong;
import java.util.Scanner;

public class ArmstrongNumber {

	static int ASN(int num)
	{
		int i ;
		int n = 0 ;
		int sum = 0 ;
		i = num ; 
		while(num > 0)
		{
			n = num % 10 ;
			num = num / 10 ;
			sum = sum + (n * n * n);
		}
		if(sum == i)
		{
			System.out.print(i+" is an Armstrong number.");
		}
		else
		{
			System.out.print(i+" is not an Armstrong number.");
		}
		return i ;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wether it is armstrong or not : ");
		int num = sc.nextInt();
		ASN(num);
		sc.close();
		
	}

}
