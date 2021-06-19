class Swap2
{
    public static void main(String args[])
    {
        int a=5;
        int b=4;
        System.out.println("Before Swapping, the numbers are:--");
        System.out.println("a:"+a+"\n"+"b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping, the numbers are:--");
        System.out.println("a:"+a+"\n"+"b:"+b);

    }
}