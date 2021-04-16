package Patterns;

public class Pattern8 {

			public static void main(String[] args) {
				
				int i = 5 , j = 2 ;
				for(int k = 1 ; k <= i ; k++)
				{
					for(int p = 1 ; p <= i ; p++)
					{
						System.out.printf("%2d ", j);
						j+=2;
					}
					System.out.println();
				
				}
			}
}
