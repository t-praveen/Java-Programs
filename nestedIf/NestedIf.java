package nestedIf;

public class NestedIf {

	public static void main(String[] args) {
	
		int a = 12 , b = 80 , c = 10;
		int result = 0;
		/*if(a > b)
		{
			if(a > c)
			{
				result = a;
			}
			else
			{
				result = c;
			}
		}
		else
		{
			if(b > c)
			{
				result = b;
			}
			else
			{
				result = c;
			}
		}
		System.out.println("The greatest number is : " + result);*/
		
							//OR 
		
		result = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c ;
		System.out.println("The greatest number is : " + result);

	}

}
