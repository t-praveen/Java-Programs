package Recursion;
import java.util.Scanner ;

public class PlayingCat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Boolean value : ");
		boolean summer = sc.nextBoolean();
		System.out.print("Enter Temperature : ");
		int temperature = sc.nextInt();
		boolean result = isCatPlaying(summer , temperature);
		System.out.println(result);
		sc.close();
	}
	 public static boolean isCatPlaying(boolean summer, int temperature)
	 {
	        if (summer && (temperature >= 25) && (temperature <= 45))
	        {
	            return true;
	        } 
	        else if (!summer && (temperature >= 25) && (temperature <= 35)) 
	        {
	            return true;
	        }
	        return false ;
	 }
}
