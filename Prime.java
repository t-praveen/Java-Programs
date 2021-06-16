class Prime
{
    public static void main(String args[])
    {
        int n=29;
        boolean isPrime=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.print(n+" is a prime number");
        else
            System.out.print(n+" is not a prime number");
    }
}