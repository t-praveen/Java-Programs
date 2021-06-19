class A
{
    public void abc()
    {
        System.out.println("A Abc");
    }
}
class B extends A
{
    public void abc()
    {
        super.abc();
        System.out.println("B Abc");
    }
}
class Super2
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.abc();
    }
}