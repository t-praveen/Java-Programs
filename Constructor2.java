class Constructor2
{
    public static void main(String args[])
    {
        Abc obj=new Abc(5,5.5f);
    }
}
class Abc
{
    public Abc()//Default Constructor//
    {
        System.out.println("Hi, I am a Constructor.");
    }
    public Abc(int i)//Parameterised Constructor//
    {
        System.out.println("Hi, I am a Parameterised Constructor.");
        
    }
    public Abc(int i,float j)//Parameterised Constructor//
    {
        System.out.println("Hi, I am a parameterised Constructor with 2 values.");
    }
}