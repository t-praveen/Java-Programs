//The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
class Student
{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;//Parameters and instance variables are same.So we are using this keyword to distinguish local variable and instance variable.//
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class This1
{
    public static void main(String args[])
    {
        Student obj1=new Student(175,"Praveen",175000);
        Student obj2=new Student(182,"Shiva",60000);
        obj1.display();
        obj2.display();
    }
}