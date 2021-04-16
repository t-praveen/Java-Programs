package Interface;


interface A
{
	void show();
}
class Sample implements A
{
	public void show()
	{
		System.out.println("Hello");
	}
	public void display()
	{
		System.out.println("Bye");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		
		//A obj=new A();   //You cannot instantiate a interface
		A obj = new Sample(); 			//You can create a refernce of interface and can call it through class.
		obj.show();
		
	}

}
