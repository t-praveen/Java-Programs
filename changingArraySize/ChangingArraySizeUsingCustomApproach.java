//CHANGING ARRAY SIZE//
package changingArraySize;
import java.util.Scanner;

public class ChangingArraySizeUsingCustomApproach {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements to be entered in array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements into the array : ");
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array before ReSize: ");
        for(int i = 0; i < a.length; i++) 
        	System.out.println(a[i]);
		int[] temp = new int[6];
        int length = a.length;
        for(int j = 0; j < length; j++)
            temp[j] = a[j];
        a = temp;
        System.out.println("Array after ReSize: ");
        for(int k = 0; k < a.length; k++) 
            System.out.println(a[k]);
       sc.close();
        
	}
}
