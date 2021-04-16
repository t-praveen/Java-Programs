package Interface;

interface X
{
	void print();
}
public class Interface2 {
	
	public static void main(String args[])
	{
		X obj = new X()
				{						//Creation of Anonymous inner class to create a object of interface and to instantiate it.
					public void print()
					{
						System.out.println("Hello");
					}
				};
		obj.print();
	}

}
