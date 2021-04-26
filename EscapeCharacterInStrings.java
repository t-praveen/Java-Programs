package strings;

public class EscapeCharacterInStrings {

	public static void main(String[] args) {
		
		String example = "This is the \"String\" class.";
		String example1 = "This is the \'String\' class.";
		String example2 = "The character \\ is called backslash.";
		System.out.println(example+"\t The sequence \\\"  inserts a double quote in a string .");
		System.out.println(example1+"\t The sequence \\\'  inserts a single quote in a string . ");
		System.out.println(example2+"\t The sequence \\\\  inserts a backslash in a string . ");
	}

}
