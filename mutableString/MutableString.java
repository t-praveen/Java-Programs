package mutableString;

public class MutableString {

	public static void main(String[] args) {
		
		
		StringBuffer sbf = new StringBuffer("Navin");
		sbf.append(" Reddy");
		//System.out.println(sbf); // Output is Navin Reddy
		
		sbf.replace(0, 5, "Manoj");
		//System.out.println(sbf);  //Output is Manoj Reddy
		
		sbf.delete(8, 10);
		System.out.println(sbf);  //Output is Manoj Rey

	}

}
