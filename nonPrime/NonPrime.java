package nonPrime;

import java.util.Scanner;

public class NonPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter Starting Number : ");
				int start = sc.nextInt();
				System.out.print("Enter Ending Number : ");
				int end = sc.nextInt();
				System.out.println("Prime numbers between "+start+" and "+end+" are : ");
				int count;
				while(start <= end)
				{
					for(int i = start ; i <= end ; i++)
					{

						count = 0;
						for(int j = 2 ; j <= i ; j++)	
						{
							if(i % j == 0)
								count = count+1;
								break;
						}
						if(count == 2)
							System.out.println(i);
					}
				
				}
				
				sc.close();
			}

	}


