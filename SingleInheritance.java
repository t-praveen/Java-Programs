class SingleInheritance
{
    public static void main(String args[])
    {
        int num1,num2,result=0;
        AddSub obj=new AddSub();
        obj.num1=5;
        obj.num2=5;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);

    }
}
class Add
{
    int num1,num2,result=0;
    public void sum()
    {
        result=num1+num2;
    }
}
class AddSub extends Add
{
    public void sub()
    {
        result=num1-num2;
    }
}