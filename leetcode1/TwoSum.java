package leetcode1;
import java.util.Scanner;

public class TwoSum {
	
	 public static int[] TS(int[] nums, int target) 
	    {
	        
	    int complement; 
	        //loop to check every element in the array
	        for (int x = 0; x<nums.length; x++) 
	        {  
	            complement = target - nums[x];
	            //loop to find complement of current element
	            for (int y = 0; y<nums.length; y++) 
	            { 
	                //we cannot use same element twice.
	                if (x ==  y) { continue; } 
	                if (nums[y] == complement) 
	                {
	                    return new int[] {x, y};
	                }
	            }            
	        }
	        return new int[] {0, 0};
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements to be entered in the array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements into the array : ");
		int nums [] = new int [n] ;
		for(int i = 0 ; i < n ; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter the target element : ");
		int target = sc.nextInt();
		int z[] ;
		z = TS(nums,target);
		if (z.length == 2) {
            System.out.println("The target element found by combining the indices of : "+"["+z[0] + "," + z[1]+"]");
        } else {
            System.out.println("No solution found!");
        }
		sc.close();

		
		
	}

}
