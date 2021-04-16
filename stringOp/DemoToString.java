package stringOp;



public class DemoToString {
	
	public static void main(String args[])
	{
		Student s1 = new Student(175,"Praveen");
		System.out.println(s1);                 //By default when you print object or reference variable , it will call ToString method and it will print package name along with class name along with its hashcode.
	}

}
class Student
{
	int rollno;
	String sname;
	public Student(int rollno, String sname) {
		this.rollno = rollno;
		this.sname = sname;
	}
	@Override
	public String toString() {             //Overriding toString method to get the output which we have given.
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
	
	

}
