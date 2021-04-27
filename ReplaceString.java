package strings;

public class ReplaceString {

	public static void main(String[] args) {
		
		String s1 = "Pqaveen";
		System.out.println("After implementing replace method ,  the 1st String is : "+s1.replace('q' , 'r'));
		String s2 = "Organisation";
		System.out.println("After implementing replace method ,  the 1st String is : "+s2.replace('s' , 'z'));
		String s3 = "C++ Programming";
		System.out.println("After implementing replace method ,  the 1st String is : "+s3.replace("C++" , "Java"));
		String s4 = "I Love You";
		System.out.println("After implementing replace method ,  the 1st String is : "+s4.replace("You" , "Myself"));
		String s5 = "Basketball";
		System.out.println("After implementing replace method ,  the 1st String is : "+s5.replace('o' , 'r'));
		String s6 = " I am Praveen";
		System.out.println("After implementing replace method ,  the 1st String is : "+s6.replace("You" , "Yes"));
	}

}
