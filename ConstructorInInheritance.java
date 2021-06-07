class A
{
    public A()
    {
        System.out.println("In A Const");
    }
    public A(int i)
    {
        System.out.println("In A Const Int");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("In B Const");
    }
    public B(int i)
    {
        System.out.println("In B Const B");
    }
}
class ConstructorInInheritance
{
    public static void main(String args[])
    {
        B obj=new B(5);
    }
}