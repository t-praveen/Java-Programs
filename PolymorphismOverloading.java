class A
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void show(int i)    //Method Overloading,Early Binding,Static Binding,Compile Time Polymorphism
    {
        System.out.println("Hello"+i);
    }
    public void show(double d)
    {
        System.out.println("Hello"+d);
    }
}
class PolymorphismOverloading
{
    public static void main(String args[])
    {
        A obj=new A();
        obj.show(5.5);
    }
}