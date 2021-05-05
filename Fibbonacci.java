class Fibbonacci
{
    public static void main(String args[])
    {
        int k,a=1,b=1;
        k=0;
        System.out.print(a+" "+b+" ");
        while(k<=50)
        {
            k=a+b;
            System.out.print(k +" ");
            a=b;
            b=k;
        }

    }
}