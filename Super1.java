class A
{
    public A()
    {
        System.out.println("In Const A");
    }
    public A(int i)
    {
        System.out.println("In Const A Para");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("In Const B");
    }
    public B(int i)
    {
        super(i);
        System.out.println("In Const B Para");
    }
}
class Super1
{
    public static void main(String args[])
    {
        B obj=new B(5);
    }
}