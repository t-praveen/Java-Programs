class A
{
    static int i;
    public A()
    {
        i++;
    }
    public void counter()
    {
        System.out.print(i);
    }
}
public static void main(String args[])
{
        A obj1=new A();
        A obj2=new A();
        A obj3=new A();
        obj1.counter();
}