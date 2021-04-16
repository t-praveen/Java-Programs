package seriesSum;
import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result = 0;
		for(float i=0; i<=n; i++)
		{
			if(i%2==0)
			{
				result -= i;
			}
			else
			{
				result += i;
			}
		}
		System.out.println(result);
		
	}

}
