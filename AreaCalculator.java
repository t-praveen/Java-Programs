package Recursion;   
import java.util.Scanner ;   
   
public class AreaCalculator { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter Radius : ");
		double radius = sc.nextDouble();
		double result1 = area(radius);
		System.out.println("The Area of the circle is :  "+result1);
		System.out.print("Enter Length : ");
		double x = sc.nextDouble();
		System.out.print("Enter Breadth : ");
		double y = sc.nextDouble();
		double result2 = area(x ,y);
		System.out.println("The Area of the Rectangle is : "+result2);
		sc.close();

	} 
	public static double area(double radius)
	{
		if(radius < 0)
			return -1.0 ;
		return Math.PI * radius * radius ;
	}
	public static double area(double x , double y)
	{
		if (x < 0 || y < 0)
			return -1.0 ;
		return x * y ;
	}

}
