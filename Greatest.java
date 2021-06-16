class Greatest
{
    public static void main(String args[])
    {
        int a,b,c;
        a=110;
        b=200;
        c=400;
        if(a>b && a>c)
            System.out.println("A which holds the value "+a+" is greatest");
        if(b>c)
            System.out.println("B which holds the value "+b+" is greatest");
        else
            System.out.println("C which holds the value "+c+" is greatest");
    }
}