package userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		float rate=sc.nextFloat();
		int time=sc.nextInt();
		float SimpleInterest=(principal*time*rate)/100;
		System.out.println("The Simple Interest is:"+SimpleInterest);
		
	}
}
