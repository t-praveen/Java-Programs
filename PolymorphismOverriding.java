class A
{
    public void show()
    {
        System.out.println("In show A");
    }
}
class B extends A
{
    public void show() //Method Overriding,Late Binding,Dynamic Binding,Runtime Polymorphism
    {
        System.out.println("In show B");
    }
}
class PolymorphismOverriding
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.show();
    }
}