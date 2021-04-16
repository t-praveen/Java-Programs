package Interface;

interface I
{
	
}
class D implements I
{
	public void see()
	{
		System.out.println("Hey");
	}
}
public class MarkerInterface {

	public static void main(String[] args) {
		
		D obj = new D();
		if(obj instanceof I)
			obj.see();
		else
			System.out.println("No permissions");

	}

}
