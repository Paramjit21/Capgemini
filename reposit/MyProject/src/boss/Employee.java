package boss;

public class Employee {
	private int empid;
	private String ename;
	private int salary;
	
	public Employee(int empid , String ename,int salary)
	{
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpid()
	{
		//System.out.println(empid);
		return empid;
	}
	public String getEname()
	{
		//System.out.println(ename);
		return ename;
	}
	public int getSalary()
	{
		//System.out.println(salary);
		return salary;
	}
	//@Override
/*	public string tostring()
	{
		return "[" + empid + ename + salary + "]";
	}*/
}
