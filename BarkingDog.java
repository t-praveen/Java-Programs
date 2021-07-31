package Recursion;     
import java.util.Scanner ; 

public class BarkingDog {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter True o False for confirming wether the dog is barking or not : ");
		boolean barking = sc.nextBoolean();
		System.out.println("Enter Hours between 0 - 23 : ");
		int hourOfDay = sc.nextInt();
		boolean result = ShouldWakeUp(barking , hourOfDay) ;
		System.out.println(result);
		sc.close();
	}
		public static boolean ShouldWakeUp(boolean barking , int hourOfDay )
		{
			if( hourOfDay < 0 || hourOfDay > 23)
			{
				return false ;
			}
			else if ( barking == true && (hourOfDay < 8 || hourOfDay > 22))
			{
				return true ; 
			}
			else
			{
				return false ;
			}
		}
}
