//CHANGING ARRAY SIZE//
package changingArraySize;

import java.util.Scanner;
import java.util.Arrays;

public class ChangingArraySizeUsingSystemArrayCopy {

	public static void main(String[] args) {

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
        a = Arrays.copyOf(a, 6);
        a[4] = 11;
        a[5] = 55;
 
        System.out.println("Array after ReSize: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
   }

}


