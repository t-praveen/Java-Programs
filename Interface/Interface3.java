package Interface;

interface Z
{
	void show();
}
public class Interface3 {

	public static void main(String[] args) {

		Z obj = () -> System.out.println("Hello");  //If single statement is there , then no need of curly braces. And we can write it in the same line.
		obj.show();
		
	}

}
/* IN INTERFACE MULTIPLE INHERITANCE IS SUPPORTED.
interface A
{
 void show();
}
interface B extends A
{
	void print();
}
interface C extends A,B
{
	void display();
}*/