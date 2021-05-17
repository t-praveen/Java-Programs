class Example8
{
    public static void main(String args[])
    {
        int obj1;
        int obj2;
        if(true)
            obj1=int(10);
        else
            obj2=double(15.0);
        System.out.println(obj1);
        obj2=true?int(10):double(15.0);
        System.out.println(obj2);
    }
}