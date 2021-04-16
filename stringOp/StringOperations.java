package stringOp;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
	
		String S1,S2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings:");
		S1 = sc.nextLine();
		S2 = sc.nextLine();
		
		int l1 = S1.length();   //To find the length of the string.
		System.out.println("The length of first string is:" + l1);
		int l2 = S2.length();
		System.out.println("The length of second string is:" + l2);
		
		
		String S3 = S1.concat(S2);  //OR S1 + S2 ... To add two strings.
		System.out.println("The result of concatenation of 2 strings is:" + S3);
		
		S1 = S1.toUpperCase();
		System.out.println("The result after converting the First string to uppercase is:" + S1);
		
		
		

	}

}
