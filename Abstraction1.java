abstract class MaheshPhone        
{     
    public void call() 
    {
        System.out.println("Calling..");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class RameshPhone extends MaheshPhone   //Abstract Class
{
    public void move()
    {
        System.out.println("Moving..");
    }
    public abstract void dance();    //Abstract Methods
    public abstract void cook();
}
class SureshPhone extends RameshPhone
{
    public void dance()
    {
        System.out.println("Dancing..");
    }
    public void cook()
    {
        System.out.println("Cooking..");
    }
}
class Abstraction1
{
    public static void main(String args[])
    {
        //MaheshPhone obj=new MaheshPhone(); You cannot instantiate the abstract class.
        //obj.call();
        MaheshPhone obj=new SureshPhone();
        obj.call();
        obj.move();
        obj.dance();
        obj.cook();
    }
}
