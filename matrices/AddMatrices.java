package matrices;
import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the 2 Matrices.");*/
		int m=sc.nextInt();
		int index;
		int n[] = new int[m];
		for(int i=0;i<m;i++)
		{
			n[i] = sc.nextInt();
			
		}
		//for(int i=m-1;i>=0;i--)
		index = sc.nextInt();
			System.out.println(n[index]);
	

	}

}
