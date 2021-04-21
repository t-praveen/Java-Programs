class EncapsulationDemo
{
    public static void main(String args[])
    {
        Emp e1=new Emp();
        e1.setEmpId(3);
        e1.setEmpName("Praveen");

        Emp e2=new Emp();
        e1.setEmpId(4);
        e1.setEmpName("Shiva");

        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());


    }
}
class Emp
{
    private int empId;
    private String empName;

    public int getEmpId() {
    	return this.empId;
    }
    public void setEmpId(int empId) {
    	this.empId = empId;
    }


    public String getEmpName() {
    	return this.empName;
    }
    public void setEmpName(String empName) {
    	this.empName = empName;
    }

}