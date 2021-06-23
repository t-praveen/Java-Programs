//DICE EMULATOR PROGRAM//


package diceemulator;
import java.util.Scanner;
import java.util.Random;

public class DiceRollerEmulator {
	
	public static void main(String args[])
	{
		System.out.print("Enter the number of dice:");
		Scanner sc = new Scanner(System.in);
		int numberofDice = sc.nextInt();
		
		Random ranNum = new Random();
		
		System.out.print("Hey ! You rolled:");
		
		int total = 0 ; 
		int randomNumber =0 ;
		for(int i = 0 ; i < numberofDice ; i++)
		{
			randomNumber = ranNum.nextInt(6) + 1 ;
			total = total + randomNumber ;
			System.out.print(randomNumber);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("Total: "+ total);
		sc.close();
		
		
		
		
		
	}

}
